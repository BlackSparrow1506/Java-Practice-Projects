package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockNotifier {

	private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String stockUpdate) {
        subscribers.forEach(subscriber -> subscriber.update(stockUpdate));
    }
}
