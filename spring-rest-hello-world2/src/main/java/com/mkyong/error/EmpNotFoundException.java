package com.mkyong.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@Controller
//@ControllerAdvice
public class EmpNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6378008919020125130L;

	//@ExceptionHandler(value=EmpNotFoundException.class)
	public EmpNotFoundException(String Message) {
		
		super(Message);
		//
	}
	

}
