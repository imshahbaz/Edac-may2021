
package com.sports.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Tournament {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tId;
	private String Sname;
	private String TName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	private int duration;
	private double fees;
	public Tournament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tournament(int tId, String sname, String tName, Date startDate, int duration, double fees) {
		super();
		this.tId = tId;
		Sname = sname;
		TName = tName;
		this.startDate = startDate;
		this.duration = duration;
		this.fees = fees;
	}
	public Tournament(String sname, String tName, Date startDate, int duration, double fees) {
		super();
		Sname = sname;
		TName = tName;
		this.startDate = startDate;
		this.duration = duration;
		this.fees = fees;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Tournament [tId=" + tId + ", Sname=" + Sname + ", TName=" + TName + ", startDate=" + startDate
				+ ", duration=" + duration + ", fees=" + fees + "]";
	}

	
	
	
}
