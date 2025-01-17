package javaexamples;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num: ");
		int Num = scanner.nextInt();
		if(Num % 2 == 0) {
			System.out.println(Num + " is even");
		}else 
		{
			System.out.println(Num + " num is odd");
		}

	}

}
