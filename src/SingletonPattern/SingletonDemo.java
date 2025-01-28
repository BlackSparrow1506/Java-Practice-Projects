package SingletonPattern;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect();

        System.out.println(connection1 == connection2); // true
    

	}

}
