package com.hotdog.mysite5.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotdog.mysite5.vo.BoardVo;
import com.hotdog.mysite5.vo.UserVo;

@Repository
public class BoardDao {

	@Autowired SqlSession sqlSession;
	
	public String showPhoto(Long no){
		return sqlSession.selectOne("board.showPhoto",no);
	}
	
	public String showVideo(Long no){
		return sqlSession.selectOne("board.showVideo",no);
	}
	
	public void photoUpload(BoardVo vo){
		sqlSession.insert("board.photoUpload", vo);
	}
	public void videoUpload(BoardVo vo){
		sqlSession.insert("board.videoUpload",vo);
	}
	public List<BoardVo> photoPost(UserVo vo){
		return sqlSession.selectList("board.photoPost",vo);
	}
	public List<BoardVo> videoPost(UserVo vo){
		return sqlSession.selectList("board.videoPost", vo);
	}
}
