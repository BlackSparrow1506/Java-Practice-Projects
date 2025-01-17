package javaexamples;

public class SawpNum {

	public static void main(String[] args) {

		int a = 5, b = 10;

		a = a + b; // a becomes 15
		b = a - b; // b becomes 5 (original value of a)
		a = a - b; // a becomes 10 (original value of b)

		System.out.println("a: " + a + " b: " + b);
	}

}
