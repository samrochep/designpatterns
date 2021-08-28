package com.sam.design_patterns.memento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperMarioGame {

	@Autowired
	private SuperMario superMario;

	public void playSuperMario(String action) {
		System.out.println("Playing super mario game..");
		switch (action) {
		case "mushroom":
			ateMushroom();
			break;
		case "spinach":
			ateSpinach();
			break;
		case "hitByObstacle":
			hitByObstacle();
			break;
		case "save":
			save();
			break;
		case "restore":
			restore();
		}
	}

	private void ateMushroom() {
		superMario.ateMushroom();
		superMario.getSuperMarioAppearance();
		System.out.println("Continue playing super mario game..");
	}

	private void ateSpinach() {
		superMario.ateSpinach();
		superMario.getSuperMarioAppearance();
		System.out.println("Continue playing super mario game..");
	}

	private void hitByObstacle() {
		superMario.hitByObstacle();
		superMario.getSuperMarioAppearance();
		System.out.println("Continue playing super mario game..");
	}
	
	private void save() {
		superMario.save();
		System.out.println("Continue playing super mario game..");
	}
	
	private void restore() {
		superMario.restore();
		System.out.println("Continue playing super mario game..");
	}


}
