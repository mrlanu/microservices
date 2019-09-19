package io.lanu.employeesearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeSearchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSearchServiceApplication.class, args);
    }

}