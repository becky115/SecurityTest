package com.eunji.admin;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	
	@RequestMapping(value="/admin/test.do")
	public ModelAndView test(){
		return new ModelAndView("/admin/test");
	}
	
	

	public static void main(String[] args) {
		
	}
}
