package chapter5;

class Person {
	String name;

//Constructor superclass
	Person(String name) {
		this.name = name;
		System.out.println("superclass");
	}
}

class Student2 extends Person {
	int id;

	Student2(String name, int id) {
		super(name);
		this.id = id;
		System.out.println("Constructor Student được gọi");
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		Student2 s = new Student2("nam", 1);
	}
}
