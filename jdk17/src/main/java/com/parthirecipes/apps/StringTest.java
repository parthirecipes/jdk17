package com.parthirecipes.apps;

public class StringTest {

	public static void main(String[] args) {

		// Below strings s1 and s2 share same memory reference
		String s1 = "abc";
		String s2 = "abc";

		// But string s3 creates new reference
		String s3 = new String("abc");

		System.out.println(" Is s1 and s2 are true  : " + (s1 == s2));
		System.out.println(" Is s1 and s3 are true  : " + (s1 == s3));

		System.out.println("\n\n But Is s1 and s3 are Equals  : " + (s1.equals(s3)));

	}
}
