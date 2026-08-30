package chapter2;

import java.util.Scanner;

public class switchStatement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("menu");
		System.out.println("1.home");
		System.out.println("2.category");
		System.out.println("3.history ");
		System.out.println("0.thoat");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("home");
			break;
		case 2:
			System.out.println("category ");
			break;
		case 3:
			System.out.println("history ");
			break;
		case 0:
			System.out.println("bye");
			break;
		default:
			System.out.println("1-3 thoi");
			break;
		}
		scanner.close();
	}
}
