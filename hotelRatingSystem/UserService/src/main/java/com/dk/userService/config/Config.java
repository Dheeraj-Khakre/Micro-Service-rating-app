package com.dk.userService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import com.dk.userService.Service.UserService;

@Configuration
public class Config {

    @Bean
    @LoadBalanced
    RestTemplate getTemplate() {
        return new RestTemplate();
    }

    @Bean
    Logger getLogger() {
        return LoggerFactory.getLogger(UserService.class);
    }
    
}
