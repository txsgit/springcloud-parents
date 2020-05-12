package com.txs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.txs.entity.User;
import com.txs.feign.UserClientService;

@Controller
public class UserController {

	@Autowired
	UserClientService userClientService;
	
	 @ResponseBody
	 @RequestMapping("/getid")
	 public User getUser(Long id)
	 {
		 System.out.println("########################"+id);
	    	return userClientService.getUser(id);
	 }
	 
	 @ResponseBody
	 @RequestMapping("/adduser")
	 public int getUser(User user)
	 {
		 System.out.println("########################"+user.getName());
	    return userClientService.addUser(user);
	 }
	 
	 @ResponseBody
	 @RequestMapping("/getUsers")
	 public List<User> getUserList()
	 {
		 return userClientService.getUserList();
	 }
	 
	 
}
