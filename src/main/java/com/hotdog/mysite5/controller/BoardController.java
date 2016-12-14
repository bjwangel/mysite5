package com.hotdog.mysite5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hotdog.mysite5.security.Auth;
import com.hotdog.mysite5.security.AuthUser;
import com.hotdog.mysite5.service.BoardService;
import com.hotdog.mysite5.vo.UserVo;

@Controller
public class BoardController {
	@Autowired 
	private BoardService boardService;

	@RequestMapping("/photoIndex")
	public String photoIndex(){
		return "photo/index";
	}
	@RequestMapping("/videoIndex")
	public String videoIndex(){
		return "video/index";
	}
	
	@Auth
	@RequestMapping("/photoupload")
	public String photoUpload(@AuthUser UserVo authUser,MultipartFile photo){
		boardService.photoUpload(authUser,photo);
		return "photo/index";
	}
	
	@Auth
	@RequestMapping("/videoupload")
	public String videoUpload(@AuthUser UserVo authUser,MultipartFile video){
		boardService.videoUpload(authUser,video);
		return "video/index";
	}
	
	@RequestMapping("/show")
	public String show(@RequestParam(value="category",required=true,defaultValue="")Long category,
					   @RequestParam(value="no",required=true,defaultValue="")Long no,Model model){
		if(category == 1){
			model.addAttribute("photo",boardService.showPhoto(no));
			return "photo/show";
		}else{
			model.addAttribute("video", boardService.showVideo(no));
			return "video/show";
		}
	}
	
}
