package javaexamples;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "AMHICH KEWAL dARJA AANI BAKI SARE KHARE DANE";
		int countWords = sentence.split("\\s").length;
		System.out.println(countWords);

	}

}
