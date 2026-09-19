package chapter3;

public class Method {
	static void calculateSum(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		System.out.println("The sum is: " + result);
	}

	public static void Main(String[] args) {
		calculateSum(5, 10);
	}
}
