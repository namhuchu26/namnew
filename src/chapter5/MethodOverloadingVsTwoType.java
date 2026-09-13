package chapter5;

class Test {
	static int add(int a, int b) {
		return a + b;
	}

// the number of argumetn
	static int add(int a, int b, int c) {
		return a + b + c;
	}

//datatype
	static void add(String a, String b, String c) {
		System.out.println(a + b + c);
	}

}

public class MethodOverloadingVsTwoType {
	public static void main(String[] args) {
		System.out.println(Test.add(10, 20));
		System.out.println(Test.add(10, 20, 30));
		Test.add("nam", "dep", "trai");

	}

}
