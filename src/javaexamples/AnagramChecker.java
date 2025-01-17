package javaexamples;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Silent";
		String str2 = "listen";
		
		char[] s1 = str1.replaceAll("//s", "").toLowerCase().toCharArray();
		char[] s2 = str2.replaceAll("//s", "").toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		System.out.println(Arrays.equals(s1, s2));
	}

}
