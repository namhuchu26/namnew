package chapter4;

class Animals {
	void eats() {
		System.out.println("eating ");
	}

};

class Dog extends Animals {
	void bark() {
		System.out.println("barking");
	}
}

class Cat extends Animals {
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
