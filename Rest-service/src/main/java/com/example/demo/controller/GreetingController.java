package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.Greeting;

@RestController
public class GreetingController {
	
	AtomicLong id = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting getGreeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(id.incrementAndGet(), "Hello, "+name);
	}

}
