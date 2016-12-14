package com.hotdog.mysite5.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotdog.mysite5.vo.UserVo;

@Repository
public class UserDao {
	@Autowired 
	private SqlSession sqlSession;
	
	public void join(UserVo vo){
		sqlSession.insert("user.join",vo);
	}
	
	public UserVo login(UserVo vo){
		System.out.println(vo);
		return sqlSession.selectOne("user.login", vo);
	}
	public void modify(UserVo authUser){
		sqlSession.update("user.modify", authUser);
	}
}
