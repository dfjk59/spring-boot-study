package com.pangu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pangu.demo.domain.User;
import com.pangu.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
    private UserService userService;
 
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findUserByName(@RequestParam(value = "userName", required = true) String userName) {
        return userService.findUserByName(userName);
    }

}
