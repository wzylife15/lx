package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  控制器
 * @author Administrator
 *
 */
@Controller
public class HelloController {

	@ResponseBody
	@GetMapping("/hello")
//	@PostMapping
//	@PutMapping
//	@DeleteMapping
//	@RequestMapping
	public String handle01() {
		return "OK!+哈哈";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
