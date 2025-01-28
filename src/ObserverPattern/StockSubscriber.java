package ObserverPattern;

public class StockSubscriber implements Subscriber {

	private String name;

	public StockSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + " received stock update: " + message);
	}

}
