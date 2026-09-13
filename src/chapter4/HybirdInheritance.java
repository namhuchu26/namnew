package chapter4;

class Person {
	void call() {
		System.out.println("information ");
	};
};

class Students extends Person {
	void callInformation() {
		System.out.println("they are student. they are under 21 years old ");
	};

};

class Teachers extends Person {
	void callInformation() {
		System.out.println("they are Teacher. ");
	};

}

class Subject extends Students {
	void nameSubject() {
		System.out.println("java core");
	}
};

public class HybirdInheritance {
	public static void main(String[] args) {
		Subject st1 = new Subject();
		st1.call();
		st1.callInformation();
		st1.nameSubject();
		Teachers teacher1 = new Teachers();
		teacher1.call();
		teacher1.callInformation();
	}
}
