package chapter3;

public class contructor {
	// Khai báo
	int studentId;
	String name;

	// 1. Constructor mặc định
	public contructor() {
	}

	// 2. Constructor có tham số
	public contructor(int id, String name) {
		this.studentId = id;
		this.name = name;
	}

	// 3. Copy Constructor
	public contructor(contructor other) {
		this.studentId = other.studentId;
		this.name = other.name;
	}

	void nhapThongTin(int id, String name) {
		this.studentId = id;
		this.name = name;
	}

	void hienThi() {
		System.out.println("Mã SV: " + studentId + " | Tên: " + name);
	}
}

class Main1 {
	public static void main(String[] args) {
		// khia bao 1
		contructor sv1 = new contructor();
		sv1.studentId = 1;
		sv1.name = "huan hoa hong1";
		sv1.hienThi();

		// khai báo cách 2
		contructor sv2 = new contructor();
		sv2.nhapThongTin(2, "do mixi");
		sv2.hienThi();

		// khai báo cách 3
		contructor sv3 = new contructor(3, "kkkkkkk");
		sv3.hienThi();

		// Cách 4: Dùng Copy Constructor để tạo sv4 sao chép từ sv3
		contructor sv4 = new contructor(sv3);
		System.out.print(": ");
		sv4.hienThi();
	}
}