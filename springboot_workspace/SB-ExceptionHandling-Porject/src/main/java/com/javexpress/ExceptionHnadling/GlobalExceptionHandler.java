package com.javexpress.ExceptionHnadling;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> HandlerException(ProductNotFoundException ex) {
		List<String> details=new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		
		ErrorDetails error=new ErrorDetails("client Error",new Date(), details);
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
				
	}
	@ExceptionHandler(Exception.class)
	
	public ResponseEntity<ErrorDetails> HandlerException(Exception ex) {
		
		List<String> details=new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		
		ErrorDetails error=new ErrorDetails("client Error",new Date(), details);
		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
