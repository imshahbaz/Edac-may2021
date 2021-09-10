package com.sports.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int pId;
	private String email;
	private int tId;
	public Participation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participation(int pId, String email, int tId) {
		super();
		this.pId = pId;
		this.email = email;
		this.tId = tId;
	}
	public Participation(String email, int tId) {
		super();
		this.email = email;
		this.tId = tId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	@Override
	public String toString() {
		return "Participation [pId=" + pId + ", email=" + email + ", tId=" + tId + "]";
	}
	
	
}
