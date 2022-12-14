package com.yyt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/23
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced   手写轮询算法暂时关闭掉
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
