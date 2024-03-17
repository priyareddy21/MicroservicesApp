package com.example.servicediscovery.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicediscovery.model.User;
import com.example.servicediscovery.service.UserServiceCls;



@RestController
@RequestMapping("/users")
public class UserController {
	
	
	    @Autowired
	    private UserServiceCls userService;

	    @PostMapping("/save")
	    public User createUser(@RequestBody User user) {
	        return userService.createUser(user);
	    }

	    @GetMapping("/{userId}")
	    public User getUserById(@PathVariable Long userId) {
	        return userService.getUserById(userId);
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = userService.getAllUsers();
	        return ResponseEntity.ok(users);
	    }

	    @PutMapping("/{userId}")
	    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User user) {
	        User updatedUser = userService.updateUser(userId, user);
	        return ResponseEntity.ok(updatedUser);
	    }

	    @DeleteMapping("/{userId}")
	    public void deleteUser(@PathVariable Long userId) {
	        userService.deleteUser(userId);
	    }
	

}
