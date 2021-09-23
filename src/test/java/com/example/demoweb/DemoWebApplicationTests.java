package com.example.demoweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootTest
class DemoWebApplicationTests {

	@Test
	void contextLoads() {
	}

}

@Controller
class PostsViewController {
	@ResponseBody
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String list() {
		return "Здесь будет главная страница";
	}
}