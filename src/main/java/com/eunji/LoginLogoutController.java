package com.eunji;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginLogoutController {
	private static final Logger logger = LoggerFactory.getLogger(LoginLogoutController.class);
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public void home(){
		logger.debug("login.do home");
	}
//	@RequestMapping(value="/login_check.do", method=RequestMethod.POST)
//	public void loginCheck(){
//		logger.debug("loginCheck");
//	}
	
	
	/*
	@RequestMapping(value="/log_out.do")
	public String logout(HttpServletRequest request, HttpServletResponse response){
		logger.debug("log_out");
	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		logger.debug("auth: " + auth);
		if (auth != null){
			logger.debug("name: "+ auth.getName()+" password: "+  auth.getPrincipal());
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login.do";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
	*/
}
