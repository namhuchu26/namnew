package chapter5;

class Animal2 {
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("Dog barking");
	}
}

public class InstanceofBeforeDowncasting {
	public static void main(String[] args) {

		Animal2 a = new Dog2();

		if (a instanceof Dog2) {
			Dog2 d = (Dog2) a;
			d.bark();
		}
	}
}
