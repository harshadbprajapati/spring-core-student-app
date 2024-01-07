package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Replace with the package where your components are located
@ComponentScan(basePackages = "org.example", lazyInit = true)
public class AppConfig {
    // Define your beans here using @Bean annotation if needed
}


