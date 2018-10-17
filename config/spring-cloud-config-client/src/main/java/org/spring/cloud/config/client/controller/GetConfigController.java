package org.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用@RefreshScope注解
 * 在客户端执行/refresh的时候就会更新此类下面的变量值
 * 
 * 手动更新GIT中的配置信息
 * 
 * #刷新配置
 * curl http://localhost:8086/refresh -X POST
 * 
 * #获取whoami的值
 * curl http://localhost:8086/whoami
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年10月16日 下午5:05:53
 */
@RestController
@RefreshScope
public class GetConfigController {
    
    @Value("${whoami}")
    private String whoami;
    
    @RequestMapping("/whoami")
    public String getConfig() {
        return whoami;
    }
}
