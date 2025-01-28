package SingletonPattern;

public class DatabaseConnection {
	
	//volatile indicates that variable may change asynchronously
	private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Connection Created");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }


}
