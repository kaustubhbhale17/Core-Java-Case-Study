package com.manipal.exception;

public class InvalidBookException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public InvalidBookException(String string) {
		super(string);
	}
}
