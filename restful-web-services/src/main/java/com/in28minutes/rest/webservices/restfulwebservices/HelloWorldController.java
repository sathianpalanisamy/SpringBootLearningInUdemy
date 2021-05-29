package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

}
