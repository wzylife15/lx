package com.atguigu.atcrowdfunding.service;

import java.util.List;
import java.util.Map;

import javax.security.auth.login.LoginException;

import com.atguigu.atcrowdfunding.bean.TAdmin;
//import com.github.pagehelper.PageInfo;

public interface TAdminService {

	TAdmin getTAdminByLogin(Map<String, Object> paramMap) throws LoginException;

//	PageInfo<TAdmin> listAdminPage(Map<String, Object> paramMap);

//	void saveTAdmin(TAdmin admin);
//
//	TAdmin getTAdminById(Integer id);
//
//	void updateTAdmin(TAdmin admin);
//
//	void deleteTAdmin(Integer id);
//
//	void deleteBatch(List<Integer> idList);

}
