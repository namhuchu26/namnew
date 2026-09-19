package chapter4;

class Person {
	void call() {
		System.out.println("information ");
	};
};

class Student extends Person {
	void callInformation() {
		System.out.println("they are student. they are under 21 years old ");
	};

};

public class SingleClass {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.call();
		st1.callInformation();
	}
}
