package com.parthirecipes.apps;

public class FactoryPatternEx {

	public static void main(String[] args) {

		new ShapeFactory().getShape("rect").draw();
		new ShapeFactory().getShape("Circle").draw();
	}
}

class ShapeFactory {

	public Shape getShape(String type) {

		if ("Rect".equalsIgnoreCase(type)) {
			return new Rect();
		} else if ("Circle".equalsIgnoreCase(type)) {
			return new Circular();
		}
		return null;
	}
}

interface Shape {

	public void draw();
}

class Rect implements Shape {
	@Override
	public void draw() {
		System.out.println("In rect draw method");
	}

}

class Circular implements Shape {
	@Override
	public void draw() {
		System.out.println("In circular draw method");
	}

}