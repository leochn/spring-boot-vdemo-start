package com.vnext.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leo
 * @version 2018/4/22 14:48
 * @since 1.0.0
 */
@Configuration
@ConditionalOnWebApplication //web用于才生效
@EnableConfigurationProperties(HelloProperies.class)
public class HelloServiceAutofiguration {

    @Autowired
    private HelloProperies helloProperies;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setHelloProperies(helloProperies);
        return helloService;

    }

}
