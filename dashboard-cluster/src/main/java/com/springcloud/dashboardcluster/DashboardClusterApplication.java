package com.springcloud.dashboardcluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableDiscoveryClient
@EnableTurbine
@SpringBootApplication
public class DashboardClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardClusterApplication.class, args);
    }

}
