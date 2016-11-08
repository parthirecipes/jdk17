package com.parthirecipes.apps;

public class FacadePatternEx {

	public static void main(String[] args) {

		new ShapeFacade().drawRect();
		new ShapeFacade().drawCircle();
	}
}

class ShapeFacade {

	public void drawRect() {
		new Rect().draw();
	}

	public void drawCircle() {
		new Circular().draw();
	}
}

interface Shape2 {

	public void draw();
}

class Rect2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("In rect draw method");
	}

}

class Circular2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("In circular draw method");
	}

}