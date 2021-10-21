package com.june11128.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// HTTP의 GET 요청을 받을 수 있는 API
	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
