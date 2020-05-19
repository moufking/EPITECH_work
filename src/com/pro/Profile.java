package com.pro;

import javax.servlet.http.HttpServletRequest;

public class Profile {
	public static Profile parseRequest(HttpServletRequest request) {
		Profile profile = new Profile();
		profile.setName(request.getParameter("name"));
		profile.setCompany(request.getParameter("company"));
		profile.setEmail(request.getParameter("email"));
		profile.setNumber(request.getParameter("number"));
		profile.setPassword(request.getParameter("password"));
		profile.setConfirmpassword(request.getParameter("confirmpassword"));
		return profile;
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	String company;
	String number;
	String email;
	String password;
	String confirmpassword;
	

}
