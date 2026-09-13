package chapter5;

class Parent {
	static void print() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	static void print() {
		System.out.println("Child");
	}
}

public class StaticBinding {
	public static void main(String[] args) {

		Parent a = new Parent();
		Parent b = new Child();

		a.print();
		b.print();
	}
}
