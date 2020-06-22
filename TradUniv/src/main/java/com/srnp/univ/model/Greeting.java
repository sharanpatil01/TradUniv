package com.srnp.univ.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
public class Greeting {

	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String greetingText;

	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Greeting(Integer id, String greetingText) {
		super();
		this.id = id;
		this.greetingText = greetingText;

	}

	public Greeting(String greetingText) {
		super();

		this.greetingText = greetingText;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGreetingText() {
		return greetingText;
	}

	public void setGreetingText(String greetingText) {
		this.greetingText = greetingText;
	}

}
