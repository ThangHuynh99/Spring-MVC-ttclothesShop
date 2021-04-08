package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.UserConverter;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IUserService;
@Service
public class UserService implements IUserService{
	@Autowired
	private UserConverter userConverter;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDTO save(UserDTO user) {
		UserEntity userEntity = userConverter.toEntity(user);
		user = userConverter.toDTO(userRepository.save(userEntity));
		return user;
	}

}
