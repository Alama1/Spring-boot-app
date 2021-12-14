package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

@RestController
public class HelloController {
	ArrayList<String> users = new ArrayList<String>();

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/user")
    public String insertUser(@RequestParam(name = "name", required = true, defaultValue = "userName") String name) {
        users.add(name);
        return "Done!";
    }

	@GetMapping("/user")
	public String insertUser() {
    	String userList = String.join(", ", users);
		return userList;
	}

	@PutMapping("/user")
	public String updateUser(@RequestParam(name = "name", required = true, defaultValue = "userName") String name) {
		users.set(users.indexOf(name), name);
		return "Done!";
	}

}
