package com.txs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.txs.entity.User;

@Controller
public class UserController {

	@Autowired
	RestTemplate restTemplate;
	private final String URL="http://SPRINGCLOUD-PROVIDER";
//	private final String URL="http://localhost:8081";
	 @ResponseBody
	 @RequestMapping("/user/id")
	 public User getUser(Long id)
	 {
	    	return restTemplate.getForObject(URL+"/user/id?id="+id, User.class);
	 }
	 
	 @ResponseBody
	 @RequestMapping("/user/add")
	 public boolean addUser(User user)
	 {
	    	return restTemplate.postForObject(URL+"/user/add", user, Boolean.class);
	 }
	
	 public static void main(String[] args) {
		
		/* Integer i  = 129;
		 Integer j = 129;
		 System.out.println(i==j);*/
//		 TreeMap
//		 System.out.println(Math.round(-2.5));
//		 System.out.println(Math.round(-2.6));
//		 System.out.println(Math.round(2.6));
		System.out.println(7>>1);
		
	}
}
