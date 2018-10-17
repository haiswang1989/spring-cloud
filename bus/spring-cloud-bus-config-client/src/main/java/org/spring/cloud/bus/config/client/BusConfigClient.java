package org.spring.cloud.bus.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月17日 下午2:39:06
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BusConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(BusConfigClient.class, args);
    }
}
