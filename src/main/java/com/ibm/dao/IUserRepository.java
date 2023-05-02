package com.ibm.dao;

import com.ibm.bean.User;

public interface IUserRepository {
	public User signIn(User user);
	public User signOut(User user);
	public User changePassword(long id, User user);
}
