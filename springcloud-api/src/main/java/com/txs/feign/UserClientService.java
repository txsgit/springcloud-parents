package com.txs.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.txs.entity.User;

//@FeignClient(value="SPRINGCLOUD-PROVIDER") //feign
//服务降级
@FeignClient(value="SPRINGCLOUD-PROVIDER",fallbackFactory=UserClientServiceFallbackFactory.class) 
public interface UserClientService {

	/**
	 * feign要求请求的url要和provider一致，
	 * 请求方法 method也要一致
	 * get请求加@RequestParam
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user/id",method=RequestMethod.GET)
    public User getUser(@RequestParam("id") Long id);
	
	 @RequestMapping(value="/user/add",method=RequestMethod.POST)
	 public int addUser(@RequestBody User user);
	 
	 @RequestMapping(value="/user/list",method=RequestMethod.GET)
	 public List<User> getUserList();
}