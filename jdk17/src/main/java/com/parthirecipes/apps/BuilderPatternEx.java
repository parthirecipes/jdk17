package com.parthirecipes.apps;

public class BuilderPatternEx {

	public static void main(String[] args) {

		UserBuilder ub = new UserBuilder("hello", "world").age(10).isMale(true).address("unknown country");
		System.out.println("\n User Builder >>> " + ub.toString());
	}
}

class UserBuilder {

	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private boolean male;

	public UserBuilder(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	public boolean isMale() {
		return male;
	}

	public UserBuilder isMale(boolean male) {
		this.male = male;
		return this;
	}

	public String toString() {

		return "Name : " + this.firstName + this.lastName + "\t age : " + this.age;
	}

}
