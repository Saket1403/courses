package com.detail.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {
    @Id
	private long token;
	private String from;
	private String to;
	private String type;
	private String truckPreference;
	private long noTruck;
	private long weight;
	private int date;
	private String comment;
	
	public Details(String from, String to, String type, String truckPreference, long noTruck, long weight, int date,
			String comment) {
		super();
		this.from = from;
		this.to = to;
		this.type = type;
		this.truckPreference = truckPreference;
		this.noTruck = noTruck;
		this.weight = weight;
		this.date = date;
		this.comment = comment;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTruckPreference() {
		return truckPreference;
	}
	public void setTruckPreference(String truckPreference) {
		this.truckPreference = truckPreference;
	}
	public long getNoTruck() {
		return noTruck;
	}
	public void setNoTruck(long noTruck) {
		this.noTruck = noTruck;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Details [from=" + from + ", to=" + to + ", type=" + type + ", truckPreference=" + truckPreference
				+ ", noTruck=" + noTruck + ", weight=" + weight + ", date=" + date + ", comment=" + comment
				+ ", getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getType()=" + getType()
				+ ", getTruckPreference()=" + getTruckPreference() + ", getNoTruck()=" + getNoTruck() + ", getWeight()="
				+ getWeight() + ", getDate()=" + getDate() + ", getComment()=" + getComment() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	

	
	
	
	
}
