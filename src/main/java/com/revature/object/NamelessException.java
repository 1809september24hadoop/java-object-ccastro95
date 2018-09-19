package com.revature.object;

import org.apache.log4j.Logger;

/**
 * The NamelessException class checks to see if an instantiated Character (abstract class)
 * has a name. If not, this exception will be thrown.
 */
public class NamelessException extends Exception{
	
	private static final Logger LOGGER = Logger.getLogger(NamelessException.class);

	private static final long serialVersionUID = 3587962568470688649L;
	
	public NamelessException(){}
	
	public NamelessException(String message) {
		super(message);
	}
	
    public NamelessException(String message, Throwable cause) {
        super(message, cause);
    }
}
