package com.example.assignment6.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.example.assignment6")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "com.example.assignment6.repository")
public class SpringConfiguration {
}
