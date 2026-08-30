package chapter2;

public class infinitiveFor {
	public static void main(String[] args) {
		int dem = 0;
		for (;;) {
			System.out.println("tets");
			dem++;
			if (dem == 3) {
				System.out.println("Đã đủ 3 lần, dừng lại!");
				break;
			}
		}
	}

}
