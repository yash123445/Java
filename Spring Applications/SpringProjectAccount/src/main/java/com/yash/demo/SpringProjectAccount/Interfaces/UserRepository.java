package com.yash.demo.SpringProjectAccount.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.demo.SpringProjectAccount.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmailId(String email);

	boolean isUsernameExists(String username);

	boolean isEmailExists(String emailId);

}