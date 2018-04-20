package com.gcricket.exception;
/**
 * Exception class 
 * @author amitv
 *
 */
public class GCricketEception extends Exception{
	
	String messgae;

	public GCricketEception(String message) {
		this.messgae = message;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	
	

}
