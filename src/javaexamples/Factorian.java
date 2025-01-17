package javaexamples;

public class Factorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact = 1, number = 5;
		for(i = 1; i <= number; i++) {
			fact = fact * i;
			
		}
		System.out.println(fact);
	}

}
