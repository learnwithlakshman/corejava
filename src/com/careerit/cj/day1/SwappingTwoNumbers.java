package com.careerit.cj.day1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap a = " + a + " b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap a = " + a + " b = " + b);
	}
}
