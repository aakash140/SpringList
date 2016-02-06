package com.spring.list;

import java.util.List;

public class Employee {

	private int emp_id;
	private String name;
	private List<Contacts> contacts;
	public Employee(List<Contacts> contacts) {
		super();
		this.contacts = contacts;
	}
	public Employee() {
		super();
	}

	public void displayEmplolyeeInfo(){
		System.out.println("******Employee Details*****");
		System.out.println("Id: "+emp_id);
		System.out.println("Name: "+name);
		for(Object temp:contacts){
			Contacts contact=(Contacts)temp;
			System.out.println("Number: "+contact.getNumber()+" "+"Type: "+contact.getType());
		}
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}