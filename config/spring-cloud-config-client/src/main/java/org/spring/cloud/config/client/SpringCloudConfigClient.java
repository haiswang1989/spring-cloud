package org.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * EnableDiscoveryClient激活对配置中心的支持
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月17日 上午10:27:21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClient.class, args);
    }
}
