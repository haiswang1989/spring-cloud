package org.spring.cloud.eureka.consumer.remote.hystrix;

import org.spring.cloud.eureka.consumer.remote.HiRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HiRemoteHystrix implements HiRemote {
    @Override
    public String sayHi(@RequestParam(value="name") String name) {
        return "hello, " + name + ", this message send failed.";
    }
}
