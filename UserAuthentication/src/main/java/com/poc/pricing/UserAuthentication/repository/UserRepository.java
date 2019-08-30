package com.poc.pricing.UserAuthentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.pricing.UserAuthentication.dto.User;

public interface UserRepository extends JpaRepository<User, String>{

	public Optional<User> findByUserNameAndPassword(String userName ,String password);
}
