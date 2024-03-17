package com.example.servicediscovery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servicediscovery.model.User;
import com.example.servicediscovery.repo.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserServiceCls {
	
	@Autowired 
	UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
		
	}
    public User getUserById(Long userId) {
    	return userRepository.findById(userId)
				.orElseThrow(()->new RuntimeException("Invalid Employee id"));
    	
    	
    }

    
    public List<User> getAllUsers(){
    	return userRepository.findAll();	
    	
    }
    
    public User updateUser(Long userId, User updatedUser) {
    	User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userId));

        // Update the existing user with the provided data
        existingUser.setFirstName(updatedUser.getFirstName());
        existingUser.setLastName(updatedUser.getLastName());
        existingUser.setEmail(updatedUser.getEmail());

        // Save the updated user back to the database
        return userRepository.save(existingUser);    	
    }
    
    
    public void deleteUser(Long userId) {
        // Check if the user exists before attempting to delete
        if (userRepository.existsById(userId)) {
            // Delete the user from the database
            userRepository.deleteById(userId);
        } else {
            throw new EntityNotFoundException("User not found with id: " + userId);
        }
    }
	
}
