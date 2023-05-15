package com.atguigu.scw.user.exp;

import com.atguigu.scw.user.enums.UserExceptionEnum;

public class UserException extends RuntimeException {
	public UserException() {
		// TODO Auto-generated constructor stub
	}
	
	public UserException(UserExceptionEnum enums) {
		// TODO Auto-generated constructor stub
		super(enums.getMessage());
	}
	
	
}
