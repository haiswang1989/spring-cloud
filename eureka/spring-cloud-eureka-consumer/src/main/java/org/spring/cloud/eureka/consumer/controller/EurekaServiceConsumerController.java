package org.spring.cloud.eureka.consumer.controller;

import org.spring.cloud.eureka.consumer.remote.HiRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月15日 下午2:33:09
 */
@RestController
public class EurekaServiceConsumerController {
    
    @Autowired
    private HiRemote hiRemote;
    
    @RequestMapping("/hi/{name}")
    public String index(@PathVariable("name") String name) {
        return hiRemote.sayHi(name);
    }
}
