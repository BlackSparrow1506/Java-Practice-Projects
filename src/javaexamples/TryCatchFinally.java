package javaexamples;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 18;
		int b = 0;
		int[] arr = {1, 2, 3, 4,};
		
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println(arr[5]);
		}catch(ArithmeticException ar) {
			System.out.println("arithmatic exception");
		}catch (Exception e){
			System.out.println("parental Exception");
		}finally {
			System.out.println("Runs anyways!");
		}
			
		}
	}


