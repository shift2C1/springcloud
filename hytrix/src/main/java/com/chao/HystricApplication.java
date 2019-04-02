package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
//可视化界面输入的路径：没有界面时候的路径（ http://localhost:8060/actuator/hystrix.stream ）
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystricApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystricApplication.class,args);
    }
}
