package com.hotdog.mysite5.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotdog.mysite5.vo.GuestbookVo;

@Repository
public class GuestbookDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void insert(GuestbookVo vo){
		sqlSession.insert("guestbook.insert",vo);
	}
}
