package observer.old;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher {

	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(String mensagem) {
		observers.forEach(o -> o.update(mensagem));
	}
}
