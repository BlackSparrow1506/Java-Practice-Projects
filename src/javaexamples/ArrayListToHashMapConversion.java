package javaexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListToHashMapConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<>();
		array.add("banana");
		array.add("mango");
		array.add("apple");

		Map<Integer, String> map = new HashMap<>();

		// Method 1 : Stream API
		map = IntStream.range(0, array.size()).boxed().collect(Collectors.toMap(i -> i, array::get));
		System.out.println(map);

		// Method 2: Using a loop
//		for (int i = 0; i < array.size(); i++) {
//			map.put(i, array.get(i));
//		}
//		System.out.println(map);
	}
}
