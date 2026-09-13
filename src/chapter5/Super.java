package chapter5;

class Animal1 {
	String color = "white";

	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	String color = "black";

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}

	@Override
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class Super {
	public static void main(String[] args) {

		Dog1 d = new Dog1();

		d.printColor();
		d.work();
	}
}