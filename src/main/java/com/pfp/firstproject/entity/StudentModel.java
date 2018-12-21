package com.pfp.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="student")
@ Entity
public class StudentModel {


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="St_Id") 
	private Integer stid;
	
	@Column(name="St_Name")
	private String stname;
	
	@Column(name="F_Name")
	private String fname;
	
	@Column(name="St_Phone")
	private Integer stphone;

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Integer getStphone() {
		return stphone;
	}

	public void setStphone(Integer stphone) {
		this.stphone = stphone;
	}

	@Override
	public String toString() {
		return "StudentModel [stid=" + stid + ", stname=" + stname + ", fname=" + fname + ", stphone=" + stphone + "]";
	}
	
	
	
	
	
}
