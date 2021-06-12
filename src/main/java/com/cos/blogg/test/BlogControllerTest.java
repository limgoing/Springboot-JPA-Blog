package com.cos.blogg.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	@GetMapping("/test/hello")
	public String test() {
		return "<h2>hello</h2>";
	}
}
