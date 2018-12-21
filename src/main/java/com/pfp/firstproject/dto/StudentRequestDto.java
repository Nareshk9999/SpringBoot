package com.pfp.firstproject.dto;

import org.springframework.stereotype.Component;

@Component
public class StudentRequestDto {
	private String sname;
	private String fname;
	private int sid;
	private int sphone;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSphone() {
		return sphone;
	}
	public void setSphone(int sphone) {
		this.sphone = sphone;
	}
	
	@Override
	public String toString() {
		return "StudRequestDto [sname=" + sname + ", fname=" + fname + ", sid=" + sid + ", sphone=" + sphone + "]";
	}
	
	
	
	}
	

