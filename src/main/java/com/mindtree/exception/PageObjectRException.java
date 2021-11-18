package com.mindtree.exception;

public class PageObjectRException extends Exception{
	String msg;
	public PageObjectRException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
		
	}
	public String toString()
	{
		return msg;
	}
}
