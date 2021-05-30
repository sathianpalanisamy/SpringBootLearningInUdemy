package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDAOService daoService;

	@GetMapping("/users")
	public List<User> retrieveAllUser() {
		return daoService.findAll();

	}

	@GetMapping("/users/{id}")
	public User retrieveUserById(@PathVariable int id) {
		return daoService.findById(id);

	}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return daoService.save(user);

	}

}
