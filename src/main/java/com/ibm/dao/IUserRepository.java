package com.ibm.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.bean.User;
@Component
public interface IUserRepository extends JpaRepository <User, Long> {

	Optional<User> findById(long id);

	User findByUserId(String userId);
}
