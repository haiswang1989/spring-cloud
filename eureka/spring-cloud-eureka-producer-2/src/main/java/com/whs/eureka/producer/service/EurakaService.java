package com.whs.eureka.producer.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * service的第二个Producer
 * 用于测试负载均衡
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月15日 下午3:13:24
 */
@RestController
public class EurakaService {
    
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello, " + name + ", i'am producer two.";
    }
    
}
