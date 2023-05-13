package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 * @author Administrator
 * 2019年7月13日
 */
//@ComponentScan("com.atguigu.springboot")
@SpringBootApplication
public class SpringbootHelloworldAutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldAutoApplication.class, args);
	}
	
	// <bean id="user" class="com.atguigu.bean.User"></bean>
	
//	@Bean
//	public User user() {
//		return new User();
//	}

}
