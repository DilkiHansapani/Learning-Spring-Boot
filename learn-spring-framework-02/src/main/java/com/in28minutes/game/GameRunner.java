package com.in28minutes.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameConsole game;
    public GameRunner(@Qualifier("SuperContraGameQualifier") GameConsole game) {
        this.game=game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
