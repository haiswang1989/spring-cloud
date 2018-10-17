package org.spring.cloud.bus.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月17日 下午2:38:40
 */
@RestController
@RefreshScope
public class BusConfigController {
    
    @Value("${whoami}")
    private String whoami;
    
    @RequestMapping("/whoami")
    public String whoami() {
        return whoami;
    }
}
