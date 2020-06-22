package com.srnp.univ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.srnp.univ.dao.GreetingRepository;
import com.srnp.univ.model.Greeting;

@SpringBootApplication
public class SpringbootApplication {

	
	@Autowired
	GreetingRepository repo;

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	

	@Bean
	CommandLineRunner clr(ApplicationContext ctx) {
		return (s) -> {
			int beanCount = ctx.getBeanDefinitionCount();
			System.out.println("Bean count=" + beanCount);
			java.util.List<String> beans = Arrays.asList(ctx.getBeanDefinitionNames());
			for (String bean : beans) {
				// System.out.println(bean);
			}

			List<String> greetingList = new ArrayList<String>(Arrays.asList(new String[] { "Hola", "Hello", "Bonjour",
					"Ciao", "Namaste", "AHN-YOUNG-HA-SE-YO", "Szia", "Jambo" }));

			greetingList.stream().forEach(greeting -> repo.save(new Greeting(greeting)));

		};
	}


}
