package com.batch.model;


public class User {

	private long userId;
	private String firstName;
	private int age;
	private String email;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String firstName, int age, String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.age = age;
		this.email = email;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
