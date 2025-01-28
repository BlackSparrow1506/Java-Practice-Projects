package javaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> num = Arrays.asList(1, 12, 12, 16, 25, 25, 45, 70, 70);
		List<Integer> evenNum = num.stream().distinct().collect(Collectors.toList());
		Collections.reverse(evenNum);
		System.out.println(evenNum);
		 // Create a modifiable list
        List<Integer> modifiableNum = new ArrayList<>(num);
		Collections.reverse(modifiableNum);
		System.out.println(modifiableNum);
		
	

	}

}
