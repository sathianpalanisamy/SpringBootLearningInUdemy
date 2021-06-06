package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	// URI Versioning

	@GetMapping("/v1/name")
	public PersonV1 personV1() {
		return new PersonV1("Sathian MP");
	}

	@GetMapping("/v2/name")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Sathian", "MP"));
	}

	// Request Param Versioning

	// http://localhost:8080/params/name?version=2

	@GetMapping(path = "params/name", params = "version=1")
	public PersonV1 paramsV1() {
		return new PersonV1("Sathian MP");
	}

	@GetMapping(path = "params/name", params = "version=2")
	public PersonV2 paramsV2() {
		return new PersonV2(new Name("Sathian", "MP"));
	}

	// Header Versioning

	@GetMapping(value = "headers/name", headers = "X-API-VERSION=1")
	public PersonV1 headersV1() {
		return new PersonV1("Sathian MP");
	}

	@GetMapping(value = "headers/name", headers = "X-API-VERSION=2")
	public PersonV2 headersV2() {
		return new PersonV2(new Name("Sathian", "MP"));
	}
	
	//Media Type Versioning
	
	@GetMapping(value = "produces/name", produces = "application/vnd.api1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Sathian MP");
	}

	@GetMapping(value = "produces/name", produces = "application/vnd.api2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Sathian", "MP"));
	}
	
	
}
