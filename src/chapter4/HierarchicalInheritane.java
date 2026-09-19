package chapter4;

class Animal{
	void eats() {
		System.out.println("eating ");
	}

};

class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing");
	}
}

public class HierarchicalInheritane {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eats();
	};
};
