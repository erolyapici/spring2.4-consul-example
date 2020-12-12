package com.example.demo;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @NotNull
    @Value("${project.domain.code}")
    private String domainCode;

    @PostConstruct
    private void sout() {
        System.out.println("DomainName => " + domainCode);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
