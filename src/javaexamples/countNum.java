package javaexamples;

public class countNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123456;
		int count = String.valueOf(a).length();
		System.out.println(count);
		
		int b = 12345678;
		int count1 = String.valueOf(b).length();
		System.out.println(count1);
		
		int i, j , row = 8;
		for(i = 0; i<row; i++) {
			for(j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
