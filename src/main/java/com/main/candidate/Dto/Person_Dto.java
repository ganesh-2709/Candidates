package com.main.candidate.Dto;

public class Person_Dto {
	private int pid;
	private String Firstname;
	private String Lastname;
	private int age;
	private long contact;
	private String location;
	
	
	public Person_Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person_Dto(int pid, String firstname, String lastname, int age, long contact, String location) {
		super();
		this.pid = pid;
		Firstname = firstname;
		Lastname = lastname;
		this.age = age;
		this.contact = contact;
		this.location = location;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
