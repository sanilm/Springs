package com.san.hellocontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
public class HelloController {
	@RequestMapping("/welcome/{countryname}/{username}")
	public ModelAndView helloworld(@PathVariable Map<String, String> pathvar){
		
		String name=pathvar.get("username");
		String country=pathvar.get("countryname");
		
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject( "msg", "hello world"+name+ "you r from"+country);
				
		
		
		return model;
		
	}

	

	
	
}
