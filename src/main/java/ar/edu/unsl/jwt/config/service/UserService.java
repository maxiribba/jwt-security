package ar.edu.unsl.jwt.config.service;

import java.util.List;

import ar.edu.unsl.jwt.config.entity.User;

public interface UserService {
	
	User createUser(User user);
	
	List<User> getUsers();
	
}
