package com.hotdog.mysite5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdog.mysite5.repository.UserDao;
import com.hotdog.mysite5.vo.UserVo;

@Service
public class UserService {

	@Autowired UserDao userDao;
	
	public void join(UserVo vo){
		userDao.join(vo);
	}
	
	public UserVo login(UserVo Vo){
		return userDao.login(Vo);
	}
	
	public void modify(UserVo authUser,UserVo vo){
		authUser.setEmail(vo.getEmail());
		authUser.setPassword(vo.getPassword());
		
		userDao.modify(authUser);
	}
}
