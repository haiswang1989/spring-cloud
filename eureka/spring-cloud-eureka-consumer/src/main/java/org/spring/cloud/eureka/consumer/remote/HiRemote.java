package org.spring.cloud.eureka.consumer.remote;

import org.spring.cloud.eureka.consumer.remote.hystrix.HiRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-producer", fallback=HiRemoteHystrix.class)
public interface HiRemote {
    
    /**
     * 这边的Path应该和Producer的Path保持一致
     * 
     * @param name
     * @return
     */
    @RequestMapping(value="/hello")
    public String sayHi(@RequestParam(value="name") String name);
    
}
