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

class Teacher extends Person {
	void callInformation() {
		System.out.println("they are Teacher. ");
	};

}

class GraduateStudent extends Student {
	void nameSubject() {
		System.out.println("java core");
	}
};

public class HybirdInheritance {
	public static void main(String[] args) {
		GraduateStudent st1 = new GraduateStudent();
		st1.call();
		st1.callInformation();
		st1.nameSubject();
		Teacher teacher1 = new Teacher();
		teacher1.call();
		teacher1.callInformation();
	}
}
