package com.in28minutes.microservices.currencyexchange;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

	@GetMapping("/sample-api")
	public String sampleAPI() {
		return "sample-api";
	}

}
