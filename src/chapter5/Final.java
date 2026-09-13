package chapter5;

class Student {

	// final variable
	final int ID;

	// static final = hằng số chung
	static final String SCHOOL = "PTIT";

	// Gán final variable trong constructor
	Student(int id) {
		ID = id;
	}

	// final method
	final void study() {
		System.out.println("studying at " + SCHOOL);
	}

	// final parameter
	void showId(final int number) {
		System.out.println("ID: " + number);
	}
}

public class Final {
	public static void main(String[] args) {

		Student s = new Student(1);

		System.out.println("Student ID: " + s.ID);

		s.study();

		s.showId(s.ID);
	}
}