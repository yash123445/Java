package com.HRManagement.HRManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.entities")
@EnableJpaRepositories("com.Interfaces")
public class HrManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrManagementSystemApplication.class, args);
    }
}
