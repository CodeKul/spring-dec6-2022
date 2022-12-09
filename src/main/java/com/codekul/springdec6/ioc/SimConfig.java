package com.codekul.springdec6.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean
    public Vodafone getObj(){
        return new Vodafone();
    }

}
