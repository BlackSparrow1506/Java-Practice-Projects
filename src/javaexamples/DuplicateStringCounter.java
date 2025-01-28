package javaexamples;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbccdfrghhigg";

        // Count occurrences using HashMap
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char arrInput : input.toCharArray()) 
            charCountMap.put(arrInput, charCountMap.getOrDefault(arrInput, 0) + 1);

        // Print duplicates
        charCountMap.forEach((key, value) -> {
            if (value > 1) System.out.println(key + " -> " + value);
        });
        
//        	Map<Character, Integer> charCountMap:
//        	A HashMap is used to store characters as keys and their counts as values.
//        	input.toCharArray():
//        	Converts the string into an array of characters for iteration.
//        	charCountMap.getOrDefault(c, 0) + 1:
//        	Checks if the character c is already in the map:
//        	If present, retrieves its current count and increments it by 1.
//        	If not, assigns a default value of 0 and increments it to 1.
//        	charCountMap.put:
//        	Updates the count of the character c in the map.

	}

}
