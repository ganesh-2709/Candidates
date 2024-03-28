package com.main.candidate.Exception;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException extends RuntimeException{
	
	@ExceptionHandler(NoSuchElementException.class)
	public String handle()
	{	
		String message="No value present, please try again with accurate data";
		return message;
		
	}
	
	@ExceptionHandler(Exception.class)
	public String anyException()
	{	
		String message="No value present, please try again";
		return message;
		
	}
	

}
