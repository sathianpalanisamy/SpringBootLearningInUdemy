package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	@GetMapping("/v1/name")
	public PersonV1 personV1() {
		return new PersonV1("Sathian MP");
	}
	
	@GetMapping("/v2/name")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Sathian", "MP"));
	}

}
