package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1.Launch a sprint context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2.Configure the things we want to manage
            //Create the configuration class : HelloWorldConfiguration @Configuration
            //Create the bean @Bean

            //Retrieving beans manage by context
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean(("age")));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person1"));

            System.out.println(context.getBean(Address.class));

            // System.out.println(context.getBean("qualifierPerson2"));

            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        catch (Exception e){
            System.out.println("exception");
        }



     }
}
