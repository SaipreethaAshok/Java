package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.User;

public interface UserService {
 
	long addUser(User user);
  
	User UpadateUser(User user);
  
    boolean DeleteUser(long id);

	User searchUser(long id);

	List<User> GetUsers();
}
