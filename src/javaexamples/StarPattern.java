package javaexamples;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row = 6;
		for(i = 0; i < row; i++) {
			for(j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
