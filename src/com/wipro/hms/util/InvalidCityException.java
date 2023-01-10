package com.wipro.hms.util;

public class InvalidCityException extends Exception {
	public InvalidCityException(){
		super();
	}
	@Override
	public String toString() {
		return "INVALID CITY";
	}
}
