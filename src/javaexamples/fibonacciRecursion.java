package javaexamples;

public class fibonacciRecursion {

	public static void main(String[] args) {
		int n = 18; // Number of Fibonacci terms to generate

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	// Recursive method to calculate Fibonacci numbers
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
