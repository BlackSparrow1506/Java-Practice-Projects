package javaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Gauri", "ashutosh", "Lokesh", "Gauri");
		List<String> UniqueName = list.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(UniqueName);
	}

}
