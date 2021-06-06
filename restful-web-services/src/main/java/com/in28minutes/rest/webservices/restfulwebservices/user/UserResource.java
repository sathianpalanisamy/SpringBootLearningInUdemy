package com.in28minutes.rest.webservices.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDAOService daoService;

	@GetMapping("/users")
	public List<User> retrieveAllUser() {
		return daoService.findAll();

	}

	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUserById(@PathVariable int id) {
		User user = daoService.findById(id);
		if (user == null) {
			throw new UserNotFoundException("id : " + id);
		}
		
		EntityModel<User> entityModel=EntityModel.of(user);
		Link builder=linkTo(methodOn(this.getClass()).retrieveAllUser()).withRel("all-users");
		entityModel.add(builder);
		return entityModel;

	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = daoService.save(user);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedUser.getId())
				.toUri();

		return ResponseEntity.created(uri).build();

	}

	@DeleteMapping("/users/{id}")
	public User deleteUserById(@PathVariable int id) {
		User user = daoService.deleteById(id);
		if (user == null) {
			throw new UserNotFoundException("id : " + id);
		}
		return user;

	}

}
