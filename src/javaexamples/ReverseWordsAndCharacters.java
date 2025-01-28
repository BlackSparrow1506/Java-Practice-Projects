package javaexamples;

import java.util.StringTokenizer;

public class ReverseWordsAndCharacters {

	public static void main(String[] args) {
		String input = "Welcome to this Javascript Guide!";
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        StringBuilder result = new StringBuilder();
        
        // Store tokens (words) in reverse order
        String[] words = new String[tokenizer.countTokens()];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            words[index++] = tokenizer.nextToken();
        }

        // Reverse the order of words and their characters
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i != 0) { // Add a space between words, except after the last word
                result.append(" ");
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result.toString());
    }

}
