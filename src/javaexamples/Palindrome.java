package javaexamples;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pahili = "Madam";
		String dusari = pahili.toLowerCase();
		String palindrome = new StringBuilder(dusari).reverse().toString();
		if(dusari.equals(palindrome)) {
			System.out.println("String is palidrome");
		}else {
			System.out.println("String is not palidrome");
		}

	}

}
