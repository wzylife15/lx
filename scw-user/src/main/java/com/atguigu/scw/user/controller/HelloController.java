package com.atguigu.scw.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags="测试Swagger工具的helloworld")
@RestController
public class HelloController {
	
	@ApiImplicitParams(value= {
			@ApiImplicitParam(value="姓名",name="name",required=true)
	})
	@ApiOperation("演示接口调用")
	@GetMapping("/hello")
	public String hello(String name) {
		
		return "OK:"+name;
	}
	
}
