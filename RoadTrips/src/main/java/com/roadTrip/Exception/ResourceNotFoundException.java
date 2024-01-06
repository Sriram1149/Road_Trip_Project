package com.roadTrip.Exception;

@ResponseStatus(value = HttpStatus.ACCEPTED)

public class ResourceNotFoundException extends RunTimeException{
	public ResourceNotFoundException() {
		super("Invalid credentials");

	 }

}
