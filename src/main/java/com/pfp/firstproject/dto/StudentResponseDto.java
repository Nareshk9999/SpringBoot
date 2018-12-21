package com.pfp.firstproject.dto;

import org.springframework.stereotype.Component;

@ Component
public class StudentResponseDto {

	private String stname;
	private String ftname;
	private int stid;
	private int stphone;
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getFtname() {
		return ftname;
	}
	public void setFtname(String ftname) {
		this.ftname = ftname;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public int getStphone() {
		return stphone;
	}
	public void setStphone(int stphone) {
		this.stphone = stphone;
	}
	@Override
	public String toString() {
		return "StudentResponseDto [stname=" + stname + ", ftname=" + ftname + ", stid=" + stid + ", stphone=" + stphone
				+ "]";
	}
	
	
	


	
}
	

