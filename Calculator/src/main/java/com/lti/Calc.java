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

	public static int rem(int num1, int num2) {
		return num1 % num2;
	}

	public static int quot(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		System.out.println(add(30, 43));
		System.out.println(sub(30, 43));
		System.out.println(prod(30, 43));
		System.out.println(rem(30, 43));
		System.out.println(quot(30, 43));
	}
}