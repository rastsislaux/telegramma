package org.lipski.telegramma

import org.lipski.telegramma.enumeration.Method
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

class Bot(url: String, token: String) {

    companion object {
        fun urlTemplate() : String = "%s/bot%s/%s";
    }

    private val restTemplate = RestTemplate();

    private val methodTemplate = String.format(urlTemplate(), url, token)

    private fun makeUri(method: Method): String {
        return String.format(methodTemplate, method.methodName)
    }

    private fun <T: Any> invokeMethod(method: Method, params: Map<String, Any?>, returnType: Class<T>): T? {
        val uriRequest = UriComponentsBuilder.fromUriString(makeUri(method))
        for (param in params) {
            uriRequest.queryParam(param.key, param.value)
        }
        return restTemplate.getForObject(uriRequest.encode().toUriString(), returnType)
    }

}