package com.atguigu.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;

@EnableGlobalMethodSecurity(prePostEnabled = true) //开启细粒度全局方法级别权限控制功能
@Configuration //声明当前类是一个配置类。相当与XML配置文件作用。
@EnableWebSecurity  //声明式配置，启用SpringSecurity安全机制。
public class AppWebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		super.configure(auth);
		
//		auth.inMemoryAuthentication().withUser("admin").password("1").roles("学徒","大师")
//		.and()
//		.withUser("li").password("1").authorities("罗汉拳","武当长拳");
//		auth.userDetailsService(userDetailsService);
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
//		super.configure(http);
//		http.authorizeRequests().antMatchers("/layui/**","/index.jsp").permitAll()
//		.anyRequest().authenticated();
		
		http.authorizeRequests().antMatchers("/layui/**","/index.jsp").permitAll()
//		.antMatchers("/level1/**").hasRole("学徒")
//		.antMatchers("/level2/**").hasRole("大师")
//		.antMatchers("/level3/**").hasRole("宗师")
		.anyRequest().authenticated();
		
//		http.formLogin();
		
		http.formLogin().loginPage("/index.jsp").usernameParameter("loginacct").passwordParameter("userpswd")
		.loginProcessingUrl("/doLogin").defaultSuccessUrl("/main.html");
		
//		http.csrf().disable();
//		http.logout();
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/index.jsp");
//		
//		http.authorizeRequests()
//		.antMatchers("/")
		
		http.exceptionHandling().accessDeniedPage("/unauth.html");
		
//		开启记住我功能
//		http.rememberMe();
		JdbcTokenRepositoryImpl ptr = new JdbcTokenRepositoryImpl();
		ptr.setDataSource(dataSource);
		
		http.rememberMe().tokenRepository(ptr);
		
	}
	
	
	public static void main(String[] args) {
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		String encode = bcpe.encode("1");
		System.out.println(encode);
	}
	
	 
	
	
	
	
}
