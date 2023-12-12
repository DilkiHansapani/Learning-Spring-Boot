package com.in28minutes.learnspringframework.game;

public class PacMan implements GameConsole{
    public void up(){
        System.out.println("Pacman Jump");
    }
    public void down(){
        System.out.println("Pacman Sit down");
    }
    public void left(){
        System.out.println("Pacman Go back");
    }
    public void right(){
        System.out.println("Pacman Shoot a bullet");
    }
}
