package com.example.componentscan.annotations.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.com.example.componentscan.annotations")
public class AppConfig {
}
