package com.chenyj.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

/**
 * 网关主要作用
 *      限流（流量控制）
 *      重试（请求失败时，重试）
 *      跨域（前后端不在一个域）
 *      路由（转发请求）
 *      鉴权（登录校验，签名校验）
 *      等
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("gateway-service地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
        // swagger启动地址： http://127.0.0.1:9001/system/swagger-ui.html
    }
}
