package observer.old;

import com.google.common.flogger.FluentLogger;

import lombok.Data;


public @Data class MessageConsumer implements Observer {
	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	
	private final String name;

	@Override
	public void update(String mensagem) {
		logger.atInfo().log("%s message: %s", name, mensagem);
	}
}
