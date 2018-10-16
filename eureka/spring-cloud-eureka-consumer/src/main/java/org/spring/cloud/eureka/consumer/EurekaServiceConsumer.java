package org.spring.cloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
 * EnableDiscoveryClient注解以后,项目就有了服务注册和服务发现的功能
 * EnableFeignClients启用feign进行远程调用
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月15日 下午2:20:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConsumer.class, args);
    }
}
