package com.in28minutes.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalService.class).findMax());
        }
    }
}
