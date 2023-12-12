package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
    @Bean
    public GameConsole game1(){
        var game = new PacMan();
        return game;
    }

    @Bean

    public GameConsole game2(){
        var game = new MarioGame();
        return game;
    }

    @Bean
    @Primary
    public GameConsole game3(){
        var game = new SuperContraGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GameConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
