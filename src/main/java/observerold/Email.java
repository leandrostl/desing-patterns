package observerold;



import lombok.extern.log4j.Log4j;
@Log4j
public class Email implements Observer {

	@Override
	public void update(String arg1) {
		log.info("Email message: " + arg1);		
	}

}
