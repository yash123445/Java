package com.yash.demo.SpringProjectAccount.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.demo.SpringProjectAccount.Interfaces.UserRepository;
import com.yash.demo.SpringProjectAccount.entities.Registration;
import com.yash.demo.SpringProjectAccount.entities.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUsernameExists(String username) {
        // Check if username exists in the database
        return userRepository.findByUsername(username) != null;
    }

    public boolean isEmailExists(String email) {
        // Check if email exists in the database
        return userRepository.findByEmailId(email) != null;
    }

    public void registerUser(Registration registration) {
        // Logic to register the user in the database
    	User user = new User();
        user.setUsername(registration.getUsername());
        user.setPassword(registration.getPassword());
        user.setDateOfBirth(registration.getDateOfBirth());
        user.setEmailId(registration.getEmailId());
        user.setMobileNo(registration.getMobileNo());

        userRepository.save(user);
    }

    public boolean isPasswordValid(String username, String password) {
        // Check if password is valid for the given username
        User user = userRepository.findByUsername(username);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }

    public void authenticateUser(String username) {
        // Logic to authenticate the user
    }
}