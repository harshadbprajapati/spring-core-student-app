package org.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExpressBTechSemesterConfig {

    @Bean
    public ExpressBTechSemester expressBTechSemester(){
        return new ExpressBTechSemester();
    }
}

