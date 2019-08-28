package com.starter.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: zjbing
 **/
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.test")
public class StarterProperties {

    private String name;

}
