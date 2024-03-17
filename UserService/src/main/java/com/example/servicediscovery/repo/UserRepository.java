package com.example.servicediscovery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.servicediscovery.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
