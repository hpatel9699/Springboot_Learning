package com.example.webApp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	private todoService todoservice;
	
public TodoController(todoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

@RequestMapping("listtodo")
	public String ListTodo(ModelMap model) {
	
	List<Todo> todos=todoservice.findByUsername("dev");
	model.addAttribute("todos",todos);
	return "listtodo";
}
}
