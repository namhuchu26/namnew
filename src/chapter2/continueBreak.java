package chapter2;

public class continueBreak {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("Gặp số 3 -> Dừng toàn bộ vòng lặp!");
				break;
			}
			System.out.println("Số: " + i);
		}
		// continue
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("Gặp số 3 -> Dừng toàn bộ vòng lặp!");
				continue;
			}
			System.out.println("Số: " + i);
		}
	}
}
