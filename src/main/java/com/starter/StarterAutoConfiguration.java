package com.starter;

import com.starter.properties.StarterProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zjbing
 **/

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
public class StarterAutoConfiguration {


    @Autowired
    private StarterProperties properties;

    @Bean
    public StarterHandler getInstance() {
        return new StarterHandler(properties.getName());
    }
}
