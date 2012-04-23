package com.winchester.mytest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class NewPageController {
	
	private static final Logger logger = LoggerFactory.getLogger(NewPageController.class);
	
	
	
	@RequestMapping(value = "NewPage", method = RequestMethod.GET)
	public String showStuff(Model model) {
		
		logger.info("Welcome to NewPage");
		String msg = "New page to render";
		model.addAttribute("msg", msg);
		return "NewPage";
	}
}
