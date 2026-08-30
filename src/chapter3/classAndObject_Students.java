package chapter3;

public class classAndObject_Students {
	// khai báo
	int studentId;
	String name;

	// contructor
	public classAndObject_Students(int id, String name) {
		studentId = id;
		this.name = name;
	}

	// contructor mạc dịnh
	public classAndObject_Students() {
	}

	void nhapThongTin(int id, String name) {
		studentId = id;
		this.name = name;
	}

	void hienThi() {
		System.out.println("Mã SV: " + studentId + " | Tên: " + name);
	}
}

class Main {
	public static void main(String[] args) {

		// khia bao 1
		classAndObject_Students sv1 = new classAndObject_Students();
		sv1.studentId = 1;
		sv1.name = "huan hoa hong";
		sv1.hienThi();

		// khai báo cách 2
		classAndObject_Students sv2 = new classAndObject_Students();
		sv2.nhapThongTin(2, "do mixi ");
		sv2.hienThi();

		// khai báo cách 3
		classAndObject_Students sv3 = new classAndObject_Students(3, "kkkkkkk");
		sv3.hienThi();
	}
}
