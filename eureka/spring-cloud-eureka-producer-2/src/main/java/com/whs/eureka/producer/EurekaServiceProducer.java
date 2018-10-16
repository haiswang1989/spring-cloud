package com.whs.eureka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 
 * EnableDiscoveryClient注解以后,项目就有了服务注册的功能
 * 启动工程后,就可以在注册中心的页面看到SPRING-CLOUD-PRODUCER服务
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月15日 上午11:32:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceProducer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProducer.class, args);
    }
}
