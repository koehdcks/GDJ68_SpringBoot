package com.example.sample.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@GetMapping("/")
	@ResponseBody
	public String getIndex() {
		return "index";
	}
	
}
