package com.txs.feign;

import java.util.List;

import org.springframework.stereotype.Component;

import com.txs.entity.User;

import feign.hystrix.FallbackFactory;

@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {

	@Override
	public UserClientService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new UserClientService(){

			@Override
			public User getUser(Long id) {
				User u=new User();
		    	u.setId(id);
		    	u.setName("该id不存在");
		    	u.setDb_source("datebase is no exit");
		    	return u;
			}

			@Override
			public int addUser(User user) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<User> getUserList() {
				// TODO Auto-generated method stub
				return null;
			}
		
		};
	}

}
