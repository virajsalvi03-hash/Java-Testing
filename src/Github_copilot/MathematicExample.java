package Github_copilot;

public class MathematicExample {
	// This method calculates the factorial of a number
	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must be non-negative.");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
		
	

	public static void main(String[] args) {
		
		int number = 5;
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is: " + result);

	}

}
