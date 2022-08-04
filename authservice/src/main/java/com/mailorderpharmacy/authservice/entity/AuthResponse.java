package com.mailorderpharmacy.authservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
	// Id for user
	private String uid;
	// Name of the user
	private String name;
	// Validity check
	private boolean isValid;
	public void isValid(String string, String string2, boolean b){
		// TODO Auto-generated constructor stub
	}
	public void setValid(boolean b) {
		this.isValid = b;
	}
	public String getUid() {
		return uid;
	}

	//public AuthResponse(String string, String string2, boolean b) {
		// TODO Auto-generated constructor stub
	//}
	//public AuthResponse() {
		// TODO Auto-generated constructor stub
	//}
	public void setUid(String uid) {
		this.uid=uid;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getValid() {
		return isValid;
	}
	
	//public void setValid(boolean isValid) {
	//	this.isValid = isValid;
	//}
	

}
