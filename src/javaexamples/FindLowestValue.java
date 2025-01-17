package javaexamples;

public class FindLowestValue {
	public static void main(String[] args) {
		int[] array = { 9, 2, 0, 3, 8 };
		int number = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < number) {
				number = array[i];
			}
		} // Output the lowest value
		System.out.println("The lowest value in the array is: " + number);
	}
}
