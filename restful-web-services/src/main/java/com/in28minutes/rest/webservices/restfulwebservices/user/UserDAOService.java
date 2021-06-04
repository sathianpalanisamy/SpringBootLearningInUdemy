package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

	private static List<User> los = new ArrayList<User>();

	private static int userCount = 3;

	static {
		los.add(new User(1, "sathian", new Date()));
		los.add(new User(2, "nivetha", new Date()));
		los.add(new User(3, "roopshree", new Date()));

	}

	public List<User> findAll() {
		return los;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);

		}
		los.add(user);
		return user;
	}

	public User findById(Integer id) {
		for (User user : los) {
			if (user.getId() == id) {
				return user;

			}

		}
		return null;
	}

	public User deleteById(Integer id) {
		Iterator<User> iterator = los.iterator();
		while (iterator.hasNext()) {

			User user = iterator.next();

			if (user.getId() == id) {
				iterator.remove();
				return user;
			}

		}
		return null;
	}

}
