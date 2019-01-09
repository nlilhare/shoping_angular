package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // defining the class as controller
public class PageController {
	@RequestMapping(value = { "","/", "/home", "/index" }) // it will have all the URL mapping in value variable
	public ModelAndView index() {// this is the class which will have both model and view
		ModelAndView mv = new ModelAndView("page");// in future we will define how to create the page as master page of
													// the applicaiton
		mv.addObject("greeting", "welcome to Spring MVC");
		System.out.println("callleeeeeeeeeeeeeeeeeeeeee");
		return mv;
	}
}
