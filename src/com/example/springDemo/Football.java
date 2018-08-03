package com.example.springDemo;

public class Football implements Sports {
	private Fortune fortune;
	private String firstName;
	private String lastName;
	private String role;
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	public Football() {
		System.out.println("inside FootBall");
	}
	@Override
	public String getSportName() {
		return "Football";
	}

	@Override
	public String getGudLuckFortune() {
		
		return "Setter Injection Example." + fortune.getDailyFortune();
	}

	
}
