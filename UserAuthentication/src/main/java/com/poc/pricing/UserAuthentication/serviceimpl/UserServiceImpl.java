package com.poc.pricing.UserAuthentication.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.poc.pricing.UserAuthentication.repository.UserRepository;
import com.poc.pricing.UserAuthentication.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	public Boolean findUser(String name,String pw) {
		
		return userRepository.findByUserNameAndPassword(name,pw).isPresent();
	}
}
