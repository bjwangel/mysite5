package com.hotdog.mysite5.security;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hotdog.mysite5.vo.UserVo;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// 1. Handler 의 종류
		if(handler instanceof HandlerMethod==false){
			return true;
		}


		// 1. Auth 가  Type(Class)에 붙어 있는지 ?
		boolean isTypeAnnotationAuth = false;
		for (Annotation annotation : ((HandlerMethod)handler).getBeanType().getDeclaredAnnotations()) {
			System.out.println( Auth.class.getName()  + " : " + annotation  );
			
		    if( annotation.toString().contains( Auth.class.getName() ) ) {
		    	isTypeAnnotationAuth = true;
		    }
		}
		
		if( isTypeAnnotationAuth == false ){
			System.out.println( "----------------------> " + isTypeAnnotationAuth );
			// 2. Auth 가  Method에 붙어 있는지 ?
			Auth auth=((HandlerMethod)handler).getMethodAnnotation(Auth.class);
			if(auth == null){
				// 접근제어가 필요없는 Handler
				return true;
			}
		}
		
		// 3. 접근 제어 
		HttpSession session=request.getSession();
		if(session== null){
			response.sendRedirect(request.getContextPath()+"/user/loginform");
			return false;
		}
		
		UserVo authUser=(UserVo)session.getAttribute("authUser");
		if(authUser == null){
			response.sendRedirect(request.getContextPath()+"/user/loginform");
			return false;
		}
		
		return true;
	}
	
}
