package com.ibm.service;

import org.springframework.stereotype.Component;

import com.ibm.bean.User;

@Component
public interface IUserService {
	public User signIn(User user);
	public User signOut(User user);
	public User changePassword(long id, User user);

	public void removeUser(long id);
	public User addUser(User user);
    

}
