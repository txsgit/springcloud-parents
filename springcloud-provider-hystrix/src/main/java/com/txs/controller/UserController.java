package com.txs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.txs.dao.UserDao;
import com.txs.entity.User;

@Controller
public class UserController {

    @Autowired
	UserDao userDao; 
    
    @ResponseBody
    @RequestMapping("/user/id")
    @HystrixCommand(fallbackMethod="hystrix_getUser")
    public User getUser(Long id)
    {
    	User u=userDao.selectUser(id);
    	if(null ==u)
    	{
    		throw new RuntimeException("######异常");
    	}
    	return u;
    }
    
    public User hystrix_getUser(Long id)
    {
    	User u=new User();
    	u.setId(id);
    	u.setName("该id不存在");
    	u.setDb_source("datebase is no exit");
    	return u;
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
