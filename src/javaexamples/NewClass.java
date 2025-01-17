package javaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NewClass {

	public static void main(String[] args) {
	
		int[] arr1 = {3, 4, 6};
		int[] arr2 = {1, 7, 9};
		
		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		
		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
	}

}
