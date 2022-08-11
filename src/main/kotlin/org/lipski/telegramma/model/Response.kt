package org.lipski.telegramma.model

open class Response<T> {
    var ok: Boolean? = null
    var result: T? = null

    override fun toString(): String {
        return String.format("{ok:%s, result:%s}", ok, result)
    }
}