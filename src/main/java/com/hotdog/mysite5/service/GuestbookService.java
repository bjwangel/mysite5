package com.hotdog.mysite5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdog.mysite5.repository.GuestbookDao;
import com.hotdog.mysite5.vo.GuestbookVo;

@Service
public class GuestbookService {

	@Autowired
	private GuestbookDao guestbookDao;
	
	public void insert(String name,String password, String content,GuestbookVo vo){
		vo.setName(name);
		vo.setPassword(password);
		vo.setContent(content);
		
		guestbookDao.insert(vo);
	}
}
