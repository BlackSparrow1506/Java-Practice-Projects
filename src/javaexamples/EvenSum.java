package javaexamples;

import java.util.Arrays;
import java.util.List;

public class EvenSum {
	
	public static void main(String[] args) {
		int[] arr = {12, 14, 15, 56, 34, 78};
		int evenSum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
		System.out.println(evenSum);
	}

}
