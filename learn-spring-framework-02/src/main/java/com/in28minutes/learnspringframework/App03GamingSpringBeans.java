package com.in28minutes.learnspringframework;

import com.in28minutes.game.GameConsole;
import com.in28minutes.game.GameRunner;

import com.in28minutes.game.PacMan;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.in28minutes.game") //GameRunner and PackMan game both in the same package.
public class App03GamingSpringBeans {

//Instead of creating this bean, we also can make GameRunner class as a component.
//    @Bean
//    public GameRunner gameRunner(GameConsole game){ //Packaman game autowire into the GameConsole class
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
//
    }
}

