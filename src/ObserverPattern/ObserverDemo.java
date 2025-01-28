package ObserverPattern;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockNotifier stockNotifier = new StockNotifier();

        Subscriber alice = new StockSubscriber("Alice");
        Subscriber bob = new StockSubscriber("Bob");

        stockNotifier.subscribe(alice);
        stockNotifier.subscribe(bob);

        stockNotifier.notifySubscribers("Stock price of XYZ increased to $120!");
	}

}
