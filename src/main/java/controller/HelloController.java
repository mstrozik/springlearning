package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	@RequestMapping("/")
	public String helloWelcome(Model model){
		String sss = "FromController";
		model.addAttribute("name", sss);
		
		return "hello";
	}
	
}
