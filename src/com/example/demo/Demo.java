package com.example.demo;

import java.util.Scanner;

public class Demo {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		char ch;
		String output = "";
		int j = 1;
		boolean status = false;
		System.out.println("Enter the string :- ");
		String value = scanner.nextLine();
		String actualValue = value.toLowerCase();

		for (int i = 0; i < actualValue.length(); i++) {
			ch = actualValue.charAt(i);
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				if (ch == actualValue.charAt(j)) {
					status = true;
					break;
				}
				if (j == actualValue.length() - 1) {
					j = actualValue.length() - 2;
				} else {
					j++;
				}
			}
		}

		if (status) {

			System.out.println("Required output is :- ");
			System.out.print(actualValue);

		} else {
			for (int i = 0; i < actualValue.length(); i++) {
				ch = actualValue.charAt(i);
				if ((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u')) {
					output = output + ch;
				}
			}
			System.out.println("Required output is :- ");
			System.out.print(output);
		}
	}

}
