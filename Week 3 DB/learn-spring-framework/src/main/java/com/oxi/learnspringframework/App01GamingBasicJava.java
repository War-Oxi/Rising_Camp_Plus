package com.oxi.learnspringframework;


import com.oxi.learningspringframework.game.GameRunner;
import com.oxi.learningspringframework.game.PacmanGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {

		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}
}
