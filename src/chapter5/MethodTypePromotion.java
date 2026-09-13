package chapter5;

class Test1 {
//	static int add(int a, long b) {
//		return a + b;
//	}
//
//	static int add(int a, int b,int c}
//
//	{
//		return a + b + c;
//	}
	// viết ở dây là sai là do đang ép return datatype sai (int) nếu muốn viết đúng
	// thì phải thêm ép kểu ở phần return
	// static int add (int a, long b ) {
	// return (int) a+b;
	// }
	static void add(int a, long b) {
		System.out.println(a + b);
	}

	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class MethodTypePromotion {
	public static void main(String[] args) {
		Test1.add(10, 20);
		Test1.add(10, 20, 30);
		System.out.println("hêlo");
	}
}
