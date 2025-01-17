package javaexamples;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " G A U R I";
		String removeWspace = a.replaceAll("\\s+", "");
		System.out.println(removeWspace);
		
		String b = "gauri12345";
		String onlyNum = b.replaceAll("\\D", "");
		System.out.println(onlyNum);

	}

}
