package com.learnbizlinks.demo.gamingconsole.game;

import org.springframework.stereotype.Component;

@Component
public class XmenGame implements GamingConsole{


    public void left() {
        System.out.println("Wolverine se mueve a la izquierda");
    }


    public void right() {
        System.out.println("Wolverine se mueve a la Derecha");
    }


    public void up() {
        System.out.println("Wolverine se mueve a la Arriba");
    }


    public void down() {
        System.out.println("Wolverine se mueve a la Abajo");
    }
}
