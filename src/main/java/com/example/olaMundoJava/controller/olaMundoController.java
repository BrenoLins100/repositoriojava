package com.example.olaMundoJava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class olaMundoController {

	@RequestMapping("/hello")
	public String olaMundo() {
		return "Hello World";
	}
}
