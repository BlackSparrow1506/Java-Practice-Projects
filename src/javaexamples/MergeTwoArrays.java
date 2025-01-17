package javaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 10, 3, 70 };
		int[] arr2 = { 1, 7, 8 };
		int[] arr3 = { 56, 79, 83 };

//		List<Integer> list1 = new ArrayList<>();
//		for (int num : arr1) {
//			list1.add(num);
//		}
//		List<Integer> list2 = new ArrayList<>();
//		for (int num : arr2) {
//			list1.add(num);
//		}
		 
		// Convert int[] to List<Integer> using Streams
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(arr3).boxed().collect(Collectors.toList());

		list1.addAll(list2);
		list1.addAll(list3);
		Collections.sort(list1);
		System.out.println(list1);
	}

}
