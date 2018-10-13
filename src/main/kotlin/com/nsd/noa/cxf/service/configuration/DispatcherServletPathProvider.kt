package com.nsd.noa.cxf.service.configuration

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath
import org.springframework.stereotype.Component

@Component
class WSDispatcherServletPathProvider : DispatcherServletPath {
    override fun getPath(): String {
        return "/NoaLinkService"
    }
}
