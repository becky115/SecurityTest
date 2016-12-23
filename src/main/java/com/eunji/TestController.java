package com.eunji;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
	@RequestMapping(value="/aa.do")
	public ModelAndView test(){
		logger.debug("aaa");
		return new ModelAndView("/a");
	}
	
	

	public static void main(String[] args) {
		
	}
}
