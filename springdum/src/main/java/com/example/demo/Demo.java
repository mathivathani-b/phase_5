package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {
@ResponseBody
@RequestMapping("/display")
	public String display() {
		return "Hello!! This is Mathivathani's area!!!!";
	}
	
}



