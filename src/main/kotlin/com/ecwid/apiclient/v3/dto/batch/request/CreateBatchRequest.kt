package com.ecwid.apiclient.v3.dto.batch.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.httptransport.HttpBody
import com.ecwid.apiclient.v3.impl.RequestInfo
import com.ecwid.apiclient.v3.util.buildQueryString

data class CreateBatchRequestWithIds(
		val requests: Map<String, ApiRequest> = emptyMap(),
		val stopOnFirstFailure: Boolean = true,
		val extraParams: Map<String, String> = emptyMap()
) : ApiRequest {

	override fun toRequestInfo() = RequestInfo.createPostRequest(
			endpoint = "batch",
			params = extraParams + mapOf(
					"stopOnFirstFailure" to stopOnFirstFailure.toString()
			),
			httpBody = HttpBody.JsonBody(
					obj = requests.map { (id, request) ->
						SingleBatchRequest.create(id, request)
					}
			)
	)
}

data class CreateBatchRequest(
		val requests: List<ApiRequest> = emptyList(),
		val stopOnFirstFailure: Boolean = true,
		val extraParams: Map<String, String> = emptyMap()
) : ApiRequest {

	override fun toRequestInfo() = RequestInfo.createPostRequest(
			endpoint = "batch",
			params = extraParams + mapOf(
					"stopOnFirstFailure" to stopOnFirstFailure.toString()
			),
			httpBody = HttpBody.JsonBody(
					obj = requests.map(SingleBatchRequest.Companion::create)
			)
	)
}

@Suppress("unused")
private data class SingleBatchRequest(
		val id: String? = null,
		val path: String = "",
		val method: String = "",
		val body: Any? = null
) {

	companion object {

		internal fun create(apiRequest: ApiRequest): SingleBatchRequest {
			return create(null, apiRequest)
		}

		internal fun create(id: String?, apiRequest: ApiRequest): SingleBatchRequest {
			val requestInfo = apiRequest.toRequestInfo()
			val queryString = buildQueryString(requestInfo.params)
			return SingleBatchRequest(
					id = id,
					method = requestInfo.method.name,
					path = requestInfo.endpoint + queryString,
					body = when (requestInfo.httpBody) {
						is HttpBody.EmptyBody -> null
						is HttpBody.JsonBody -> requestInfo.httpBody.obj
						is HttpBody.ByteArrayBody -> throw IllegalStateException("Request type ${HttpBody.ByteArrayBody::class.java.simpleName} is not allowed in batch requests")
						is HttpBody.InputStreamBody -> throw IllegalStateException("Request type ${HttpBody.InputStreamBody::class.java.simpleName} is not allowed in batch requests")
						is HttpBody.LocalFileBody -> throw IllegalStateException("Request type ${HttpBody.LocalFileBody::class.java.simpleName} is not allowed in batch requests")
					}
			)
		}
	}

}

