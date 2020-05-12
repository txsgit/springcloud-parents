package com.txs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.txs.entity.User;

@Mapper
//@Component
public interface UserDao {

	public Integer addUser(User user);
	
	public User selectUser(Long id);
	
	public List<User> getList();
}
