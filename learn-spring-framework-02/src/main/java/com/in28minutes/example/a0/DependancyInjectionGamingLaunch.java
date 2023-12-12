package com.in28minutes.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //GameRunner and PackMan game both in the same package.
public class DependancyInjectionGamingLaunch {

//Instead of creating this bean, we also can make GameRunner class as a component.
//    @Bean
//    public GameRunner gameRunner(GameConsole game){ //Packaman game autowire into the GameConsole class
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DependancyInjectionGamingLaunch.class)){

        }
//
    }
}

