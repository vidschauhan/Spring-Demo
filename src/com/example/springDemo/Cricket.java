package com.example.springDemo;

public class Cricket implements Sports {

	private Fortune fortune;
	
	public Cricket(Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getSportName() {
		return "Cricket";
	}
	
	public String getGudLuckFortune() {
		return fortune.getDailyFortune();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
