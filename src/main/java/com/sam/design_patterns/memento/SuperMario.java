package com.sam.design_patterns.memento;

import org.springframework.stereotype.Component;

@Component
public class SuperMario {

	private static final String DEFAULT_COLOR = "blue";
	private String color = DEFAULT_COLOR;

	private Boolean mushroom = Boolean.FALSE;
	private Boolean spinach = Boolean.FALSE;

	public static class SuperMarioMemento {

		private static final String DEFAULT_COLOR = "blue";
		private static String color = DEFAULT_COLOR;
		private static Boolean mushroom = Boolean.FALSE;
		private static Boolean spinach = Boolean.FALSE;
	}

	public void ateMushroom() {
		this.mushroom = true;
		this.color = "green";
	}

	public void ateSpinach() {
		this.spinach = true;
		this.color = "orange";
	}

	public void hitByObstacle() {
		this.mushroom = false;
		this.spinach = false;
		this.color = DEFAULT_COLOR;
	}

	public void getSuperMarioAppearance() {
		System.out.println("Super Mario's color is " + color);
		if (mushroom && !spinach) {
			System.out.println("Super Mario has grown up !");
		} else if (spinach) {
			System.out.println("Super Mario has got bullet powers !");
		} else {
			System.out.println("Super Mario is short and he has no bullet powers !");
		}
	}

	public void save() {
		SuperMarioMemento.mushroom = this.mushroom;
		SuperMarioMemento.spinach = this.spinach;
		SuperMarioMemento.color = this.color;
		System.out.println("Saving current state of super mario..");
	}

	public void restore() {
		this.mushroom = SuperMarioMemento.mushroom;
		this.spinach = SuperMarioMemento.spinach;
		this.color = SuperMarioMemento.color;
		this.getSuperMarioAppearance();
	}

}
