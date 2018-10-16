package org.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetConfigController {
    
    @Value("${whoami}")
    private String whoami;
    
    @RequestMapping("/whoami")
    public String getConfig() {
        return whoami;
    }
}
