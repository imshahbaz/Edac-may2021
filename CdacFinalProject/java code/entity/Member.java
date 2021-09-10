package com.sports.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Member")
public class Member {
	
	private String fname;
	private String lname;
	@Id
	private String email;
	private String contact;
	@Column(columnDefinition = "TINYINT")
	private boolean membership;
	private String pass;
	private char gender;
	private String role;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String fname, String lname, String email, String contact, boolean membership, String pass,
			char gender, String role) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.membership = membership;
		this.pass = pass;
		this.gender = gender;
		this.role = role;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isMembership() {
		return membership;
	}
	public void setMembership(boolean membership) {
		this.membership = membership;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Member [fname=" + fname + ", lname=" + lname + ", email=" + email + ", contact=" + contact
				+ ", membership=" + membership + ", pass=" + pass + ", gender=" + gender + ", role=" + role + "]";
	}
	
	
	
}
