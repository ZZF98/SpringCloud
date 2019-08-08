package com.springcloud.consumer;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableFeignClients//开启声明式服务调用
@SpringCloudApplication
public class ConsumerApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
//    /**
//     * 使用随机
//     * @return
//     */
//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
