package BuilderPattern;


/*Builder Pattern
What is happening? Constructs complex objects step by step, providing more control over the creation process. 
When to use? Use it when an object has multiple configurations and variations.
Real-Time Example in IT Industry: REST Client Builders: For configuring HTTP clients like timeouts, headers, and request body.*/

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Laptop laptop = new Laptop.Builder()
		            .setProcessor("Intel i7")
		            .setRam(16)
		            .setStorage(512)
		            .build();

		        System.out.println(laptop);

	}

}
