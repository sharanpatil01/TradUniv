package com.srnp.univ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srnp.univ.model.AppliedGreeting;
import com.srnp.univ.model.Greeting;


@Controller
public class GreetingWebController {

	@RequestMapping(path = "/web/greet/detailed/{name}", method = RequestMethod.GET)
	public String defaultGreetingObjPayload(@PathVariable String name, Model model) {

		Greeting g = new Greeting(100, "Hola-");
		AppliedGreeting ag = new AppliedGreeting(g, name);
		model.addAttribute("agreeting", ag);

		return "index";
	}

}
