package com.example.demo;

import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ConfigurationProperties {

    @NotNull
    private String foo;
}
