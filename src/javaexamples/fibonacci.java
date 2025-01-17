package javaexamples;

public class fibonacci {

	public static void main(String[] args) {
		int n = 18; // Number of Fibonacci terms to generate
		int firstTerm = 0;
		int secondTerm = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 1; i <= n; i++) {
			// Compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			System.out.print(firstTerm + " ");
		}

	}

}
