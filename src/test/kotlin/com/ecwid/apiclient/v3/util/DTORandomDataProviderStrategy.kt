package com.ecwid.apiclient.v3.util

import org.reflections.Reflections
import org.reflections.util.ReflectionUtilsPredicates.withClassModifier
import uk.co.jemos.podam.api.AbstractRandomDataProviderStrategy
import uk.co.jemos.podam.api.DataProviderStrategy
import uk.co.jemos.podam.common.PodamConstants
import java.lang.reflect.Constructor
import java.lang.reflect.Modifier
import java.util.*

internal class DTORandomDataProviderStrategy : AbstractRandomDataProviderStrategy() {

	private val concreteSubclassesMap = HashMap<Class<*>, ConcreteSubclassesProvider<*>>()

	override fun sort(constructors: Array<out Constructor<*>>, order: DataProviderStrategy.Order) {
		// We should not call surrogate data constructor with random parameters
		// Instead we should call the second most parameters constructor
		constructors.sortWith(
			compareBy { c: Constructor<*> ->
				c.parameterTypes.lastOrNull()?.simpleName == "DefaultConstructorMarker"
			}.thenByDescending { c: Constructor<*> ->
				c.parameterTypes.size
			}
		)
	}

	override fun <T> getSpecificClass(abstractClass: Class<T>): Class<out T> {
		return getConcreteSubclassesProvider(abstractClass).next
	}

	override fun getNumberOfCollectionElements(type: Class<*>): Int {
		return when {
			type.isEnum -> type.enumConstants.size
			type.isInterface || Modifier.isAbstract(type.modifiers) -> getConcreteSubclassesProvider(type).count
			else -> PodamConstants.DEFAULT_NBR_COLLECTION_ELEMENTS
		}
	}

	private fun <T> getConcreteSubclassesProvider(abstractClass: Class<T>): ConcreteSubclassesProvider<T> {
		@Suppress("UNCHECKED_CAST")
		return concreteSubclassesMap.getOrPut(abstractClass) { ConcreteSubclassesProvider(abstractClass) } as ConcreteSubclassesProvider<T>
	}

	private class ConcreteSubclassesProvider<out T>(val abstractClass: Class<out T>) {

		private val subclasses = LinkedList<Class<out T>>()
		private var iterator: Iterator<Class<out T>>

		val next: Class<out T>
			get() {
				if (subclasses.isEmpty()) {
					return abstractClass
				}
				if (!iterator.hasNext()) {
					iterator = subclasses.iterator()
				}
				return iterator.next()
			}

		val count: Int
			get() = subclasses.size

		init {
			fillConcreteSubclasses(abstractClass)
			sortClassesByName(subclasses)
			iterator = subclasses.iterator()
		}

		@Suppress("UNCHECKED_CAST")
		private fun fillConcreteSubclasses(abstractClass: Class<out T>) {
			val subclasses = reflections.getSubTypesOf(abstractClass as Class<T>)
				.filter { clazz ->
					val isAbstract = withClassModifier(Modifier.ABSTRACT).test(clazz)
					val isInterface = withClassModifier(Modifier.INTERFACE).test(clazz)
					val isSubclassOfEnum = clazz?.superclass?.isEnum == true
					!isAbstract && !isInterface && !isSubclassOfEnum
				}
			this.subclasses.addAll(subclasses)
		}

		private fun sortClassesByName(classes: MutableList<Class<out T>>) {
			classes.sortWith { x, y ->
				x.simpleName.compareTo(y.simpleName)
			}
		}

		companion object {
			private val reflections = Reflections("com.ecwid.apiclient.v3")
		}
	}
}
