package com.lti;

public class Calc {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int prod(int num1, int num2) {
		return num1 * num2;
	}
	public static void main(String[] args) {
		System.out.println(add(30, 43));
		System.out.println(sub(30, 43));
	}
}