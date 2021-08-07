package com.laptrinhjavaweb.repository.impl;

import com.laptrinhjavaweb.repository.UserRepositoryCustome;

public class CustomeUserRepository implements UserRepositoryCustome{

	@Override
	public void hello() {
		System.out.println("Hello everyone");		
	}
}
