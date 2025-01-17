package javaexamples;

public class IntString {

    public static void main(String[] args) {
        String intString = "ABCD1234";
        
        String numbersOnly = intString.replaceAll("\\D", ""); 
        System.out.println(numbersOnly);
    }
	
//	public static void main(String[] args) {
//        String intString = "ABCD1234";
//        
//        // Use regex to replace all non-digit characters with an empty string
//        String numbersOnly = intString.replaceAll("[^0-9]", "");
//        
//        // Check if any digits were found
//        if (!numbersOnly.isEmpty()) {
//            System.out.println("Extracted numbers: " + numbersOnly);
//        } else {
//            System.out.println("No numbers found in the string.");
//        }
//    }
}
