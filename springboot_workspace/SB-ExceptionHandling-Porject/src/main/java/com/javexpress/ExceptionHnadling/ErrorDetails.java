package com.javexpress.ExceptionHnadling;

import java.util.Date;
import java.util.List;

public class ErrorDetails {
	
	private String message;
	private Date date;
	private List<String> details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", date=" + date + ", details=" + details + "]";
	}
	public ErrorDetails(String message, Date date, List<String> details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}
	
	public ErrorDetails() {
		
	}
	}
