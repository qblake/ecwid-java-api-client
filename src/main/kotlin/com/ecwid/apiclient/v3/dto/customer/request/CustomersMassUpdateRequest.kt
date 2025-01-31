package com.ecwid.apiclient.v3.dto.customer.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.httptransport.HttpBody
import com.ecwid.apiclient.v3.impl.RequestInfo

data class CustomersMassUpdateRequest(
	val keyword: String? = null,
	val minOrderCount: Int? = null,
	val maxOrderCount: Int? = null,
	val minSalesValue: Int? = null,
	val maxSalesValue: Int? = null,
	val taxExempt: Boolean? = null,
	val acceptMarketing: Boolean? = null,
	val purchasedProductIds: String? = null,
	val customerGroupIds: String? = null,
	val countryCodes: String? = null,
	val lang: String? = null,
	val customer: MassUpdateCustomer = MassUpdateCustomer()
) : ApiRequest {
	override fun toRequestInfo() = RequestInfo.createPostRequest(
		pathSegments = listOf(
			"customers_update"
		),
		params = toParams(),
		httpBody = HttpBody.JsonBody(
			obj = customer
		)
	)

	private fun toParams(): Map<String, String> {
		val request = this
		return mutableMapOf<String, String>().apply {
			request.keyword?.let { put("keyword", it) }
			request.minOrderCount?.let { put("minOrderCount", it.toString()) }
			request.maxOrderCount?.let { put("maxOrderCount", it.toString()) }
			request.minSalesValue?.let { put("minSalesValue", it.toString()) }
			request.maxSalesValue?.let { put("maxSalesValue", it.toString()) }
			request.taxExempt?.let { put("taxExempt", it.toString()) }
			request.acceptMarketing?.let { put("acceptMarketing", it.toString()) }
			request.purchasedProductIds?.let { put("purchasedProductIds", it) }
			request.customerGroupIds?.let { put("customerGroupIds", it) }
			request.countryCodes?.let { put("countryCodes", it) }
			request.lang?.let { put("lang", it) }
		}.toMap()
	}
}
