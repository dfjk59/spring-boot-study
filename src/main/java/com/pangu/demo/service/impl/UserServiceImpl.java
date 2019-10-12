/**
 * 
 */
package com.pangu.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pangu.demo.dao.UserDao;
import com.pangu.demo.domain.User;
import com.pangu.demo.service.UserService;

/**
 * @author Administrator
 *
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
 
    @Override
    public User findUserByName(String userName) {
        User user = userDao.findUserByName(userName);
        return  user;
    }

}
