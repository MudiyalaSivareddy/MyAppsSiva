package com.mkyong.error;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String Msg) {
		super(Msg);
		
	}

}
