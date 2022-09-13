package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.User;
import org.tnsif.c2tc.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
 UserRepo repo;

@Override
public long addUser(User user) {
	User u=repo.save(user);
	if(u!=null)
		return 1;
		else
			return 0;
}

@Override
public User UpadateUser(User user) {
	User u=repo.save(user);
	return u;
}



@Override
public boolean DeleteUser(long id) {
	User u=searchUser(id);
	if(u!=null)
	{
		repo.delete(u);
		return true;
	}
	else
		return false;
}

@Override
public User searchUser(long id) {
	User u=repo.findById(id).get();
	return u;
}

@Override
public List<User> GetUsers() {
	List<User> users=repo.findAll();
	return users;
}

}
