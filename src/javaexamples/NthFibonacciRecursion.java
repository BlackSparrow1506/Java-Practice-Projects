package javaexamples;

public class NthFibonacciRecursion {

	public static void main(String[] args) {
		int n = 20; // Change this value to find the nth Fibonacci number

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
