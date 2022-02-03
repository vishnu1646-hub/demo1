package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList<Item>();
		System.out.println("enter : ");
		String data = scanner.next();
		list.add(new Item("sam", "Sam123"));
		list.add(new Item("ram", "Ram123"));

		if (list.get(0).getName().contains(data)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
