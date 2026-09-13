package chapter5;

class Animal {

	Animal getAnimal() {
		return new Animal();
	}

	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {

	Dog getAnimal() {
		return new Dog();
	}

	void sound() {
		System.out.println("Dog barks");
	}

	void run() {
		System.out.println("Dog is running");
	}
}

public class CovariantReturnType {
	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.sound();
		dog.run();
		Dog newDog = dog.getAnimal();

		newDog.sound();
		newDog.run();
	}
}
