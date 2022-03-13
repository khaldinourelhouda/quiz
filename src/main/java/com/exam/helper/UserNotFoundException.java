package com.exam.helper;

public class UserNotFoundException extends Exception {

	public UserNotFoundException() {
		super("User with this Username not found in BD !!");
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
	
}
