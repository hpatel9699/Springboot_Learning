package com.example.webApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class todoService {
private static List<Todo> todos=new ArrayList<>();

static {
	todos.add(new Todo(1,"jhsudc","udshud",
			LocalDate.now().plusYears(1),false));
	todos.add(new Todo(2,"dev","udshud",
			LocalDate.now().plusYears(2),false));
	todos.add(new Todo(3,"fulll","udshud",
			LocalDate.now().plusYears(3),false));

}

public List<Todo> findByUsername(String username){
	return todos;
}
}
