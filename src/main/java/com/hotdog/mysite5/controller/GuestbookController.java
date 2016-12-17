package com.hotdog.mysite5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotdog.mysite5.service.GuestbookService;
import com.hotdog.mysite5.vo.GuestbookVo;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {

	@Autowired
	private GuestbookService guestbookService;
	
	@RequestMapping("/")
	public String index(){
		return "guestbook/index";
	}
	
	@RequestMapping("/insert")
	public String insert(@RequestParam(value="name",required=true,defaultValue="") String name,
						 @RequestParam(value="password",required=true,defaultValue="0000") String password,
						 @RequestParam(value="content",required=true,defaultValue="") String content,
						 @ModelAttribute GuestbookVo vo){
		
		guestbookService.insert(name,password,content,vo);
		
		return "guestbook/index";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="no",required=true,defaultValue="1") Long no,
						 @RequestParam(value="password",required=true,defaultValue="") String password,
						 @ModelAttribute GuestbookVo vo){
		guestbookService.search(no);
		
		return "guestbook/index";
	}
}
