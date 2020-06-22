package com.srnp.univ.model;

public class AppliedGreeting {

	private Greeting greeting;
	private String greetWho;

	public AppliedGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppliedGreeting(Greeting greeting, String greetWho) {
		super();
		this.greeting = greeting;
		this.greetWho = greetWho;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public String getGreetWho() {
		return greetWho;
	}

	public void setGreetWho(String greetWho) {
		this.greetWho = greetWho;
	}

}
