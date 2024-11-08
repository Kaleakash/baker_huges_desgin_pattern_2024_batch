package com.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.CustomService;
import com.service.FeatureService;
import com.service.MyService;

@Configuration
public class MyConfiguration {

    // This bean will only be created if SomeExternalClass present in class path
    @Bean
    @ConditionalOnClass(name = "com.service.SomeExternalClass")
    public MyService myService() {
        return new MyService();
    }
    
    // This bean will only be created if the 'feature.enabled' property is set to true
    @Bean
    @ConditionalOnProperty(name = "feature.enabled", havingValue = "true")
    public FeatureService featureService() {
        return new FeatureService();
    }
    
 // This bean will only be created if there is no other CustomService bean in the context
    @Bean
    @ConditionalOnMissingBean(CustomService.class)
    public CustomService defaultCustomService() {
        return new CustomService("Default CustomService created because no other CustomService bean exists.");
    }
}
