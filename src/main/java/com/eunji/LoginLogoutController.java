package com.eunji;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	

}
