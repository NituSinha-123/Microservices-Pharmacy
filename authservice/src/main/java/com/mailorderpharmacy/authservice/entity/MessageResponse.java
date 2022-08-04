package com.mailorderpharmacy.authservice.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Model class for the business details
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class MessageResponse {
	public MessageResponse(String string, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}
	public MessageResponse() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *Response message
	 */
	String message;
	/**
	 *Response date 
	 */
	LocalDateTime date;
	public void setMessage(String string) {
		// TODO Auto-generated method stub
		message = string;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	public void setDate(LocalDateTime date2) {
		// TODO Auto-generated method stub
		date = date2;
	}
	public Object getDate() {
		// TODO Auto-generated method stub
		return date;
	}
	
	
}
