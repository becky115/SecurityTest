package com.eunji.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eunji.TestController;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value="/main.do")
	public ModelAndView test(){
		logger.debug("main.do");
		return new ModelAndView("/main/index");
	}
	
}
