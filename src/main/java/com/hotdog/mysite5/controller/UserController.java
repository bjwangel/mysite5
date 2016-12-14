package com.hotdog.mysite5.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotdog.mysite5.security.Auth;
import com.hotdog.mysite5.security.AuthUser;
import com.hotdog.mysite5.service.BoardService;
import com.hotdog.mysite5.service.CommentService;
import com.hotdog.mysite5.service.UserService;
import com.hotdog.mysite5.vo.BoardVo;
import com.hotdog.mysite5.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired 
	private UserService userService;
	@Autowired 
	private BoardService boardService;
	@Autowired 
	private CommentService commentService;
	
	
	@RequestMapping("/joinform")
	public String joinForm(){
		return "user/joinform";
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute UserVo vo,BindingResult result){
		if(result.hasErrors()){
			return "user/joinform";
		}else{
			userService.join(vo);
			return "main/index";
		}
	}

	@RequestMapping("/loginform")
	public String loginForm() {
		return "user/loginform";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {

		session.removeAttribute("authUser");
		session.invalidate();

		return "redirect:/";
	}
	
	@Auth
	@RequestMapping("/modifyform")
	public String modifyform(){
		return "user/modifyform";
	}
	
	@Auth
	@RequestMapping("/modify")
	public String modify(@AuthUser UserVo authUser,@ModelAttribute UserVo vo){
		
		userService.modify(authUser,vo);
		return "user/modifysuccess";
	}
	
	@Auth
	@RequestMapping("/mypost")
	public String myPost(@AuthUser UserVo authUser,Model model){
		List<BoardVo> photo = boardService.photoPost(authUser);
		List<BoardVo> video = boardService.videoPost(authUser);
		
		model.addAttribute("photo", photo);
		model.addAttribute("video", video);
		
		return "user/mypost";
	}
}
