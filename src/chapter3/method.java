package chapter3;

public class method {
	static void calculateSum(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		System.out.println("The sum is: " + result);
	}

	public static void main(String[] args) {
		calculateSum(5, 10);
	}
}
