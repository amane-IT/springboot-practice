package com.june11128.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// 스프링부트 테스트와 JUnit사이의 연결자
@RunWith(SpringRunner.class)
// Web에 집중할 수 있는 어노테이션
// 대신 @Service, @Component, @Repository... 는 사용 불가
@WebMvcTest(controllers = HelloController.class)

public class HelloControllerTest {
	// 스프링이 관리하는 Beans을 주입받음
	@Autowired
	// 웹 API 테스트시 사용
	// HTTP GET, POST등에 대한 API 테스트 가능
	private MockMvc mvc;

	@Test
	public void hello가_리턴된다() throws Exception{
		String hello = "hello";

		mvc.perform(get("/hello"))
			.andExpect(status().isOk())			// mvc.perform의 결과 검증 --> 200, 404, 500 등을 검증 // ok = 200
			.andExpect(content().string(hello)); //응답 본문 내용 검증
	}
}
