package com.ibm.service;

import org.springframework.stereotype.Component;

import com.ibm.bean.User;

@Component
public class IUserServiceImplementation implements IUserService{

	@Override
	public User signIn(User user) {
		System.out.println("Hello From sign in " + user);
		return null;
	}

	@Override
	public User signOut(User user) {
		System.out.println("Hello From signOut" + user);
		return null;
	}

	@Override
	public User changePassword(long id, User user) {
		System.out.println("Hello From changePassword with id "+ id + " user "+ user);
		return null;
	}

}
