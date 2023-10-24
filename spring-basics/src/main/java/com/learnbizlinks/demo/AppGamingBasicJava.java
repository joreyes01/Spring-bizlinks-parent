package com.learnbizlinks.demo;

import com.learnbizlinks.demo.gamingconsole.config.GameConfig;
import com.learnbizlinks.demo.gamingconsole.game.MarioGame;
import com.learnbizlinks.demo.gamingconsole.game.PacmanGame;
import com.learnbizlinks.demo.gamingconsole.game.XmenGame;
import com.learnbizlinks.demo.gamingconsole.runner.GameRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppGamingBasicJava {
	//Iteración 1
	public static void main(String[] args) {
		//Iteración 2
//		// Instancia del juego
//		MarioGame marioGame = new MarioGame();
//		//Instancia del juego Pacman
//		PacmanGame pacmanGame = new PacmanGame();
//		//Instancia del juego Xmen
//		XmenGame xmen = new XmenGame();
//
//		// Instancia del GameRunner (Ejecutador de juegos)
//		var gameRunner = new GameRunner(xmen);
//		gameRunner.run();

		//Iteración 3
		ApplicationContext ctx = new AnnotationConfigApplicationContext(GameConfig.class);
		ctx.getBean(GameRunner.class).run();
	}
}
