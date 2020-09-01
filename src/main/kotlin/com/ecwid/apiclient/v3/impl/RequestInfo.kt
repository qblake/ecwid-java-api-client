package com.ecwid.apiclient.v3.impl

import com.ecwid.apiclient.v3.httptransport.HttpBody

class RequestInfo private constructor(
		val endpoint: String,
		val method: HttpMethod,
		val params: Map<String, String>,
		val httpBody: HttpBody
) {
	companion object {
		fun createGetRequest(endpoint: String, params: Map<String, String> = mapOf()): RequestInfo {
			return RequestInfo(endpoint, HttpMethod.GET, params, HttpBody.EmptyBody)
		}

		fun createDeleteRequest(endpoint: String, params: Map<String, String> = mapOf()): RequestInfo {
			return RequestInfo(endpoint, HttpMethod.DELETE, params, HttpBody.EmptyBody)
		}

		fun createPostRequest(endpoint: String, params: Map<String, String> = mapOf(), httpBody: HttpBody): RequestInfo {
			return RequestInfo(endpoint, HttpMethod.POST, params, httpBody)
		}

		fun createPutRequest(endpoint: String, params: Map<String, String> = mapOf(), httpBody: HttpBody): RequestInfo {
			return RequestInfo(endpoint, HttpMethod.PUT, params, httpBody)
		}
	}
}

enum class HttpMethod {
	GET,
	POST,
	PUT,
	DELETE
}
