package com.ecwid.apiclient.v3.dto.category.request

data class UpdatedCategory(
		val parentId: Int? = null,
		val orderBy: Int? = null,
		val name: String? = null,
		val description: String? = null,
		val enabled: Boolean? = null,
		val productIds: List<Int>? = null
)