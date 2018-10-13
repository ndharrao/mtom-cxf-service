package com.nsd.noa.cxf.service.configuration


import com.nsd.noa.cxf.service.NoaLinkServiceImpl
import com.nsd.noa.cxf.service.communication.EmailClient
import com.nsd.noa.cxf.service.util.LoggingServiceImpl
import org.apache.cxf.bus.spring.SpringBus
import org.apache.cxf.jaxws.EndpointImpl
import org.apache.cxf.transport.servlet.CXFServlet
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import javax.xml.ws.Endpoint

@Configuration
class CXFServiceConfig {
    @Bean
    fun dispatcherServlet(): ServletRegistrationBean<*> {
        return ServletRegistrationBean(CXFServlet(), "/service/*")
    }

    @Autowired lateinit var bus : SpringBus
    @Autowired lateinit var email: EmailClient
    @Autowired lateinit var logger : LoggingServiceImpl

    @Bean
    fun endPoint(): Endpoint {
        val endpoint = EndpointImpl(bus, NoaLinkServiceImpl(email, logger))
        endpoint.publish("/NoaLinkService")
        endpoint.address = "/NoaLinkService"
        endpoint.properties["mtom-enabled"] = true
        return endpoint
    }


    @Bean
    fun marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath = "com.nsd.noa.schema"
        marshaller.setMtomEnabled(true)
        return marshaller
    }

    @Bean
    fun logger(): Logger = LoggerFactory.getLogger(LoggingServiceImpl::class.java)

}