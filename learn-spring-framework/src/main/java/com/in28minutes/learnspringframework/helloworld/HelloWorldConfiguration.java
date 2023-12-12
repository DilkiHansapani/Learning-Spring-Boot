package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){  };
record  Address(String number, String road){ };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Dilki";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean
    @Primary
    public Person person(){
        return new Person("Sasi",23, new Address("78","bakers"));
    }

    @Bean
    public Address address(){
        return new Address("46","rukgaha");
    }

    @Bean
    @Qualifier("qualifierPerson2")
    public Person person1(){
        return new Person(name(),age(),address());
    }

    /*
    @Bean(name="person1")
    public Person person(){
        return new Person("Pasi",16);
    }*/
}
