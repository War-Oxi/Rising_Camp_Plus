package com.oxi.learningspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Go Up");
	}

	@Override
	public void down() {
		System.out.println("Go Down");
	}

	@Override
	public void left() {
		System.out.println("Go Left");
	}

	@Override
	public void right() {
		System.out.println("Go Right");
	}
}
