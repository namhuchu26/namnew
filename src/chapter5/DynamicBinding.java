package chapter5;

class Parent1 {
	void print() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	@Override
	void print() {
		System.out.println("Child");
	}
}

public class DynamicBinding {
	public static void main(String[] args) {

		Parent1 a = new Parent1();
		Parent1 b = new Child1();

		a.print();
		b.print();
	}
}
