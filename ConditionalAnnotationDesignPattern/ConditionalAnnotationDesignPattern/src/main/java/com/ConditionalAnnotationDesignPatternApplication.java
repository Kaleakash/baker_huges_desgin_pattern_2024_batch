package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.CustomService;
import com.service.FeatureService;
import com.service.MyService;

@SpringBootApplication
public class ConditionalAnnotationDesignPatternApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConditionalAnnotationDesignPatternApplication.class, args);
		
		 // Check if the bean is available
        if (context.containsBean("myService")) {
            MyService myService = (MyService) context.getBean("myService");
            myService.display1();
        } else {
            System.out.println("MyService bean is not created because SomeExternalClass is not present.");
        }
        
        
     // Check if the bean is available
        if (context.containsBean("featureService")) {
            FeatureService featureService = (FeatureService) context.getBean("featureService");
            featureService.runFeature();
        } else {
            System.out.println("FeatureService bean is not created because feature.enabled is false or not set.");
        }
        
        // Check and retrieve the CustomService bean
        if (context.containsBean("customService")) {
            CustomService customService = (CustomService) context.getBean("customService");
            customService.printMessage();
        } else {
            System.out.println("No CustomService bean available.");
        }
	}

}
