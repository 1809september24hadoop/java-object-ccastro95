package com.revature.object;

import org.apache.log4j.Logger;

/**
 * The DodgeException class checks to see if an instantiated Character (abstract class)
 * has dodged. If they have and a character attacks, this exception will be thrown.
 */
public class DodgeException extends RuntimeException{
	
	private static final Logger LOGGER = Logger.getLogger(DodgeException.class);

	private static final long serialVersionUID = 3587962568470688649L;
	
	public DodgeException(){}
	
	public DodgeException(String message) {
		super(message);
	}
	
    public DodgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
