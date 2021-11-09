package com.mkyong.error;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mkyong.entity.FetilizersErrors;

@ControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(EmpNotFoundException.class)
	public ResponseEntity<FetilizersErrors> empNotFoundExceptions(EmpNotFoundException ex){
		FetilizersErrors error=new FetilizersErrors(204,ex.getMessage());
		return new ResponseEntity<FetilizersErrors>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<FetilizersErrors> ResourceNotFoundExceptions(ResourceNotFoundException ex){
		FetilizersErrors error=new FetilizersErrors(204,ex.getMessage());
		return new ResponseEntity<FetilizersErrors>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	

}
