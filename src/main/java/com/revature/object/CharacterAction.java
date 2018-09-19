package com.revature.object;

import org.apache.log4j.Logger;

public interface CharacterAction {

	Logger LOGGER = Logger.getLogger(CharacterAction.class);
	
	void run();
	
	void dodge();
	
	default void taunt(String message) {
		LOGGER.info("Showing no anguish, they taunt at their opposite, saying: ");
		LOGGER.info(message);
	}
	
	void attack();
		
	void disappear();
	
	default void victorySpeech(String message) {
		LOGGER.info("As the victorious one(s), they boast out in triumph: ");
		LOGGER.info(message);
	}
}
