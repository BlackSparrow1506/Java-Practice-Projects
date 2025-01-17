package javaexamples;

import java.util.Arrays;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"banana", "apple", "chery"};
		Arrays.sort(word, (a, b) -> a.length() - b.length());
		System.out.println(Arrays.toString(word));

	}

}
