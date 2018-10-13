package com.nsd.noa.cxf.service.util

import org.slf4j.Logger
import org.springframework.stereotype.Service

@Service
class LoggingServiceImpl(val logger: Logger) : LoggingService {
    override fun logException(exception: Exception) {
        logger.error("Runtime Exception occurred. Details below :\n", exception)
    }

    override fun log(message: String) {
        logger.info(message)
    }

}