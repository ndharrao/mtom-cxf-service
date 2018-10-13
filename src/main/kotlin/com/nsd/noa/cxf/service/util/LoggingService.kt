package com.nsd.noa.cxf.service.util

interface LoggingService {

    fun log(message : String)
    fun logException(exception: Exception)
    fun logHeader(header: String): Unit = "*".repeat(20).let { log("$it $header $it") }
}