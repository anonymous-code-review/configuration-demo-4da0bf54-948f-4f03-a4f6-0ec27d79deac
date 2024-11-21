package com.leanmind.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class PropertiesDemoApplication {

    @Value("${test.my-property}")
    String myProperty;

    public static void main(String[] args) {
        SpringApplication.run(PropertiesDemoApplication.class, args);
    }

}
