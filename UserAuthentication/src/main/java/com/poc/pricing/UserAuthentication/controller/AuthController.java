package com.poc.pricing.UserAuthentication.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.poc.pricing.UserAuthentication.service.UserService;


@RestController
public class AuthController {

	@Autowired
	UserService userService;

	@PostMapping("/authenticate")
	public ResponseEntity<Boolean> authenticate(@RequestBody String encodedCred) {

		Boolean isValidUSer= false;

		if (encodedCred != null) {
			
			byte[] credDecoded = Base64.getDecoder().decode(encodedCred);
			String credentials = new String(credDecoded, StandardCharsets.UTF_8);
			final String[] values = credentials.split(":", 2);
			isValidUSer = userService.findUser(values[0],values[1]);

		}
		return new ResponseEntity<Boolean>(isValidUSer, HttpStatus.OK);
	}
	
}
