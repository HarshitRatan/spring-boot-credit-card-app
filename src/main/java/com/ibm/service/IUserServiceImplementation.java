package com.ibm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.bean.User;
import com.ibm.dao.IUserRepository;

@Component
public class IUserServiceImplementation implements IUserService {
	@Autowired
	IUserRepository dao;

	@Override
	public User signIn(User user) {
		User savedUser = dao.findByUserId(user.getUserId());
		if (savedUser.getPassword().equals(user.getPassword())) {
			savedUser.setStatus(true);
			dao.save(savedUser);
			System.out.println("User signed in: " + savedUser);
			return savedUser;
		} else {
			System.out.println("User sign-in failed for: " + user);
		}
		return null;

	}

	@Override
	public User signOut(User user) {

		User savedUser = dao.findByUserId(user.getUserId());
		if (savedUser != null && savedUser.isStatus()) {
			savedUser.setStatus(false);
			dao.save(savedUser);
			System.out.println("User " + user.getUserId() + " has been signed out.");
			return savedUser;
		} else {
			System.out.println("User " + user.getUserId() + " has not signed in yet.");
		}
		return null;
	}

	@Override
	public User changePassword(long id, User user) {

		Optional<User> optionalUser = dao.findById(id);
		if (optionalUser.isPresent()) {
			User existingUser = optionalUser.get();
			existingUser.setPassword(user.getPassword());
			User updatedUser = dao.save(existingUser);
			System.out.println("Password updated in the database: " + updatedUser);
			return updatedUser;
		} else {
			System.out.println("User not found with id " + id);
			return null;
		}
	}

	@Override
	public void removeUser(long id) {
		System.out.println("Hello From removeduser with id " + id);
		dao.deleteById(id);

	}

	@Override
	public User addUser(User user) {
		System.out.println("Hello From adduser with value " + user);
		User savedUser = dao.findByUserId(user.getUserId());
		if (savedUser == null) {
			savedUser = dao.save(user);
			System.out.println("New user signed up: " + savedUser);
			return savedUser;

		}
		return null;

	}
}
