package com.example.webApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	//say hello
	
	@RequestMapping("hello")
	@ResponseBody
	public String Hello()
	{
		return "Hello!Thanks for visiting";
	}
	//src/main/resources/META-INF/resources/WEB-INF/jsp
	@RequestMapping("sayHello-jsp")
	public String HelloHtml()
		{
				return "sayHello";
	}
	
}
