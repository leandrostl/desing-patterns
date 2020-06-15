package observerold;

import java.util.stream.Stream;

import org.apache.log4j.BasicConfigurator;

import lombok.extern.log4j.Log4j;

@Log4j
public class ObserverMain {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Inicializando observer pattern");	
		
		var publisher = new MessagePublisher();
		
		var phone = new Cellphone();
		var email = new Email();
		
		Stream.of(phone, email).forEach(publisher::addObserver);
		
		publisher.notifyObservers("Teste observabilidade");				
	}
	
	
}
