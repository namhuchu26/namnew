package chapter4;

interface Device {
	void turnOn();
}

class Laptop implements Device {
	public void turnOn() {
		System.out.println("Laptop is turning on.");
	}
}

class Student {

	private Laptop laptop;

	Student(Laptop laptop) {
		this.laptop = laptop;
	}

	void study() {
		System.out.println("Student is studying Java.");
		laptop.turnOn();
	}
}

public class AggergationAndInterface {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Student student = new Student(laptop);
		student.study();
	}
}
