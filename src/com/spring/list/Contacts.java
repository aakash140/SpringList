package com.spring.list;

public class Contacts {

	private int number;
	private String type;
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacts(int number, String type) {
		super();
		this.number = number;
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}