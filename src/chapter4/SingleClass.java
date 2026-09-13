package chapter4;

class Peoples {
	void call() {
		System.out.println("information ");
	};
};

class Students extends Peoples {
	void callInformation() {
		System.out.println("they are student. they are under 21 years old ");
	};

};

public class SingleClass {
	public static void main(String[] args) {
		Students st1 = new Students();
		st1.call();
		st1.callInformation();
	}
}
