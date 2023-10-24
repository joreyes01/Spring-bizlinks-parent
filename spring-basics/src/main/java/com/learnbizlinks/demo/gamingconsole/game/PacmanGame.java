package com.learnbizlinks.demo.gamingconsole.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("Pacman va hacia arriba");
    }

    public void left() {
        System.out.println("Pacman va hacia la izquierda");
    }

    public void right() {
        System.out.println("Pacman va hacia la derecha");
    }

    public void down() {
        System.out.println("Pacman va hacia abajo");
    }
}
