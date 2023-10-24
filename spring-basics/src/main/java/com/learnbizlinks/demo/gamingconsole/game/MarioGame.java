package com.learnbizlinks.demo.gamingconsole.game;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

    public void up() {
        System.out.println("Mario va hacia la arriba");
    }

    public void left() {
        System.out.println("Mario va hacia la izquierda");
    }

    public void right() {
        System.out.println("Mario va hacia la derecha");
    }

    public void down() {
        System.out.println("Mario se agacha");
    }
}