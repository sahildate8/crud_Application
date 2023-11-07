package com.sahilCURDspringboot.frontController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/return")
	public String home1()
	{
		return "view_batch";
	}

}
