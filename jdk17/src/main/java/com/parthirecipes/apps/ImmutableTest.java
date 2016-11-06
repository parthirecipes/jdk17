package com.parthirecipes.apps;

public class ImmutableTest {

	public static void main(String[] args) {

		Immutable obj1 = new Immutable("Hello");
		System.out.println("Immutable value : " + obj1.getName());
	}
}

/**
 * Immutable class should be
 * 
 * 1. class should be final 2. No setter methods.
 */
final class Immutable {

	private String name;

	public Immutable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}