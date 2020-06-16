package observer.old;

import java.util.stream.Stream;

import com.google.common.flogger.FluentLogger;


public class ObserverMain {
	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	public static void main(String[] args) {
		logger.atInfo().log("Init observer pattern");	
		
		final var publisher = new MessagePublisher();		
		Stream.of("Cellphone", "Email", "Twitter").map(MessageConsumer::new).forEach(publisher::addObserver);
		
		publisher.notifyObservers("Observer test.");				
	}
}
