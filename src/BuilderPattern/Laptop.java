package BuilderPattern;

public class Laptop {
	private String processor;
    private int ram;
    private int storage;

    // Private constructor to enforce the use of the Builder
    private Laptop(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

public static class Builder {

	 private String processor;
     private int ram;
     private int storage;

     public Builder setProcessor(String processor) {
         this.processor = processor;
         return this;
     }

     public Builder setRam(int ram) {
         this.ram = ram;
         return this;
     }

     public Builder setStorage(int storage) {
         this.storage = storage;
         return this;
     }

     public Laptop build() {
         return new Laptop(this);
     }
 

 @Override
 public String toString() {
     return "Laptop [processor=" + processor + ", ram=" + ram + ", storage=" + storage + "]";
 }
}

}
