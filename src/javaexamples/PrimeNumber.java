package javaexamples;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime= 15;
		boolean isPrime =  true;
		for(int i = 2; i < Math.sqrt(prime); i++) {
			if(prime % i == 0) {
				isPrime = false;
				break;
			}
		} System.out.println(isPrime);
	} 

}
