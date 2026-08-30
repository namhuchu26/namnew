package chapter2;

public class For {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("hello nam ");
		}
		// for loongf nhau
		// bang cuu chuong
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	}
}
