package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static public Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		List<Document> list = new ArrayList<Document>();
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter the id: ");
			int id = scanner.nextInt();
			System.out.println("Enter the title: ");
			String title = scanner.next();
			System.out.println("Enter the folder name: ");
			String folderName = scanner.next();
			System.out.println("Enter the pages count: ");
			int pages = scanner.nextInt();
			list.add(new Document(id, title, folderName, pages));
		}

		List<Document> actualList = docsWithOddPages(list);
		for (int i = 0; i < actualList.size(); i++) {
			System.out.println(actualList.get(i));
			System.out.println();
		}

	}

	private static List<Document> docsWithOddPages(List<Document> documents) {
		List<Document> list1 = new ArrayList<Document>();
		for (Document document : documents) {
			int count = document.getPages();
			if (count % 2 != 0) {
				list1.add(document);
			}
		}
		return list1;
	}

}
