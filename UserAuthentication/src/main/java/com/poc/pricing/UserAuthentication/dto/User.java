package com.poc.pricing.UserAuthentication.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@Column(name="USERNAME")
	private String userName;
	@NotNull
	@NotEmpty
	@Column(name="PASSWORD")
	private String password;
	
}
