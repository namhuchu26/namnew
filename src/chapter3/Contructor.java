package chapter3;

public class Contructor {
	// Khai báo
	int studentId;
	String name;

	// 1. Constructor mặc định
	public Contructor() {
	}

	// 2. Constructor có tham số
	public Contructor(int id, String name) {
		this.studentId = id;
		this.name = name;
	}

	// 3. Copy Constructor
	public Contructor(Contructor other) {
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
		Contructor sv1 = new Contructor();
		sv1.studentId = 1;
		sv1.name = "huan hoa hong1";
		sv1.hienThi();

		// khai báo cách 2
		Contructor sv2 = new Contructor();
		sv2.nhapThongTin(2, "do mixi");
		sv2.hienThi();

		// khai báo cách 3
		Contructor sv3 = new Contructor(3, "kkkkkkk");
		sv3.hienThi();

		// Cách 4: Dùng Copy Constructor để tạo sv4 sao chép từ sv3
		Contructor sv4 = new Contructor(sv3);
		System.out.print(": ");
		sv4.hienThi();
	}
}