package com.june11128.book.springboot.web;

import com.june11128.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// HTTP의 GET 요청을 받을 수 있는 API
	@GetMapping("/hello/dto")
	public HelloResponseDto helloDto(@RequestParam("name") String name,
		@RequestParam("amount") int amount){
		return new HelloResponseDto(name, amount);
	}
}
