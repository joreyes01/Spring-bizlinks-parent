package com.learnbizlinks.demo.gamingconsole.game;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
    public void left();
    public void right();
    public void up();
    public void down();
}
