package com.hotdog.mysite5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdog.mysite5.repository.CommentDao;

@Service
public class CommentService {
	
	@Autowired
	private CommentDao commentDao;
}
