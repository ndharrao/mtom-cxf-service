package com.nsd.noa.cxf.service.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.nsd.noa.cxf.service, com.nsd.noa.cxf.service.*")
class NoaCxfServiceApplication

fun main(args: Array<String>) {
    runApplication<NoaCxfServiceApplication>(*args)
}
