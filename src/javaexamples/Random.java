package javaexamples;

public class Random {
	public static void main(String[] args) {
		
		System.out.println(Math.random() * 101); //random number from 0 to 100
		
		String str = "";
		System.out.println(str.isEmpty()); //return TRUE or FALSE
		String strr = "    ";
		System.out.println(strr.isBlank()); //if char is available then it's false other wise true
		System.out.println(strr.length());
		
		String a = "gauri langote";
		String b = "langote";
		System.out.println(a.contains(b)); //returns true or false
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
	}
}
