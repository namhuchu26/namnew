package chapter2;

import java.util.Scanner;

public class WhileTrue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String passWord = "admin123";
		String setPassWord = "";
		while (!setPassWord.equals(passWord)) {
			System.out.print("Vui lòng nhập mật khẩu: ");
			setPassWord = scanner.nextLine();
			if (!setPassWord.equals(passWord)) {
				System.out.println("sai thư lại ");
			}
		}
		System.out.println("ok ");
	}
}
