package com.com.example.autowire.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.com.example.autowire.annotation")
public class AppConfig {
}
