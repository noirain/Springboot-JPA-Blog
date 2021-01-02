package com.sc.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot boot boot</h1>";
	}
}