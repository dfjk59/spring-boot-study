package com.pangu.demo.service;

import org.springframework.stereotype.Service;

import com.pangu.demo.domain.User;

@Service
public interface UserService {
	User findUserByName(String userName);
}
