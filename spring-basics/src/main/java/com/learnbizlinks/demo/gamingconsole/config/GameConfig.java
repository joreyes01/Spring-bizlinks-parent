package com.learnbizlinks.demo.gamingconsole.config;

import com.learnbizlinks.demo.gamingconsole.game.GamingConsole;
import com.learnbizlinks.demo.gamingconsole.game.MarioGame;
import com.learnbizlinks.demo.gamingconsole.game.PacmanGame;
import com.learnbizlinks.demo.gamingconsole.runner.GameRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learnbizlinks.demo.gamingconsole")
public class GameConfig {

//    @Bean
//    public GamingConsole game(){
//        return new MarioGame();
//    }
//
//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }
}
