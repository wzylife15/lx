package com.atguigu.scw.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSessionController {
	

	@GetMapping("/set")
	public String setSession(HttpSession session) {
		
		//org.springframework.session.web.http.SessionRepositoryFilter$SessionRepositoryRequestWrapper$HttpSessionWrapper
		System.out.println(session.getClass());
		
		//session数据发生变化，一定要重新存储。否则，redis中数据就是旧数据。
		session.setAttribute("msg", "Hello"); //解决session一致性问题，将session持久化到redis中
		
		return "ok";
	}

	@GetMapping("/get")
	public String getSession(HttpSession session) {
		
		System.out.println(session.getClass());
		
		return (String) session.getAttribute("msg");
	}

}
