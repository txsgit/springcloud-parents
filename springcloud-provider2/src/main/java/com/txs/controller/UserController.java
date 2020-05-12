package com.txs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.txs.dao.UserDao;
import com.txs.entity.User;

@Controller
public class UserController {

    @Autowired
	UserDao userDao; 
    
    @ResponseBody
    @RequestMapping("/user/id")
    public User getUser(Long id)
    {
    	return userDao.selectUser(id);
    }
    
    @ResponseBody
    @RequestMapping(value="/user/add",method=RequestMethod.POST)
    public int addUser(@RequestBody User user)
    {
    	return userDao.addUser(user);
    }
    
    @ResponseBody
    @RequestMapping("/user/list")
    public List<User> getUserList()
    {
    	return userDao.getList();
    }
	
}
