package com.hotdog.mysite5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hotdog.mysite5.repository.BoardDao;
import com.hotdog.mysite5.vo.BoardVo;
import com.hotdog.mysite5.vo.UserVo;

@Service
public class BoardService {
	
	@Autowired 
	private BoardDao boardDao;
	
	public void photoUpload(UserVo vo,MultipartFile photo){
	
	}
	
	public void videoUpload(UserVo vo,MultipartFile video){
		
	}
	
	public String showPhoto(Long no){
		return boardDao.showPhoto(no);
	}
	public String showVideo(Long no){
		return boardDao.showVideo(no);
	}
	public List<BoardVo> photoPost(UserVo vo){
		return boardDao.photoPost(vo);
	}
	public List<BoardVo> videoPost(UserVo vo){
		return boardDao.videoPost(vo);
	}
}
