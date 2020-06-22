package com.srnp.univ.controller;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srnp.univ.dao.GreetingRepository;
import com.srnp.univ.model.AppliedGreeting;
import com.srnp.univ.model.Greeting;


@RestController
public class GreetingsController {
	@Autowired
	GreetingRepository repo;

	@RequestMapping(path = "/greet/default", method = RequestMethod.GET)
	public String defaultGreeting() {
		return "Hello Micro-Service!";
	}

	@RequestMapping(path = "/greet/{name}", method = RequestMethod.GET)
	public String defaultGreeting(@PathVariable String name) {
		return "Hello " + name + " @ " + Instant.now().toString();
	}

	@RequestMapping(path = "/greet/detailed/{name}", method = RequestMethod.GET, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE })
	public AppliedGreeting defaultGreetingObjPayload(@PathVariable String name) {

		Greeting g = new Greeting(100, "Hello");
		AppliedGreeting ag = new AppliedGreeting(g, name);
		return ag;
	}
	
	@RequestMapping(path = "/greetings/all", method = RequestMethod.GET)
	public List<Greeting> allGreeting() {
		return repo.findAll();
	}

}
