package javaexamples;

public class FindSecMaxLogically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {13, 23, 67, 34, 566878, 567, 5799, 345};
		int size = array.length;
		
		int secMax = array[size-2];
		System.out.println("Second Max value is:" + secMax);

	}

}
