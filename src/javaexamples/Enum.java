package javaexamples;

public class Enum {
	enum levels {
		LOW,
		MEDIUM,
		HIGH,
		MODERATE
	}
	
	public static void main(String[] args) {
		levels temp = levels.LOW;
		System.out.println(temp);
	}

}
