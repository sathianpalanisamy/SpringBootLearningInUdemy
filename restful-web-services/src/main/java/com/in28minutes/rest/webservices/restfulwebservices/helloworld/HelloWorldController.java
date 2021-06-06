package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")

	@Autowired
	private MessageSource messageSource;

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World With Bean");
	}

	@GetMapping("/hello-world-bean/pathVariable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean("Hello World " + name);
	}

	@GetMapping("/hello-world-internalized")
	public String helloWorldInternalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("good.morning.messages", null, "Default Message", locale);
	}
	
	@GetMapping("/hello-world-internalized-Simplified")
	public String helloWorldInternalizedSimplifiedManner() {
		return messageSource.getMessage("good.morning.messages", null, "Default Message", LocaleContextHolder.getLocale());
	}
}
