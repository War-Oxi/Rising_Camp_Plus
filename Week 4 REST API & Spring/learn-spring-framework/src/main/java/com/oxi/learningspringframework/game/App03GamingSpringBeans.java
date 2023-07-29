package com.oxi.learningspringframework.game;


import com.oxi.learningspringframework.game.GamingConfiguration;
import com.oxi.learningspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).down();

			context.getBean(GameRunner.class).run();
		}
	}
}
