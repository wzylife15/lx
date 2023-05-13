package com.atguigu.atcrowdfunding.component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.atguigu.atcrowdfunding.bean.TAdmin;
import com.atguigu.atcrowdfunding.bean.TAdminExample;
import com.atguigu.atcrowdfunding.bean.TPermission;
import com.atguigu.atcrowdfunding.bean.TRole;
import com.atguigu.atcrowdfunding.mapper.TAdminMapper;
import com.atguigu.atcrowdfunding.mapper.TPermissionMapper;
import com.atguigu.atcrowdfunding.mapper.TRoleMapper;



@Component
public class SecurityUserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	TAdminMapper adminMapper;
	
	@Autowired
	TRoleMapper roleMapper;
	
	@Autowired
	TPermissionMapper permissionMapper;
	
	Logger log = LoggerFactory.getLogger(SecurityUserDetailsServiceImpl.class);
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		TAdminExample example = new TAdminExample();
		example.createCriteria().andLoginacctEqualTo(username);
		List<TAdmin> list = adminMapper.selectByExample(example);
		
		if(list!=null && list.size()==1) {
			TAdmin admin = list.get(0);
			Integer adminId = admin.getId();
			
			log.debug("用户信息:{}",admin);
			
			
//			查询角色集合
			List<TRole> roleList = roleMapper.listRoleByAdminId(adminId);
			
//			查询权限集合
			List<TPermission> permissionList = permissionMapper.listPermissionByAdminId(adminId);
			
			Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
			
			for(TRole role : roleList) {
				authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
			}
			
			log.debug("用户角色集合:{}",roleList);
//			
			for(TPermission permission : permissionList) {
				authorities.add(new SimpleGrantedAuthority(permission.getName()));
				log.debug(permission.getName());
			}
			log.debug("用户总权限集合:{}",permissionList);
			
			
			
			return new User(admin.getLoginacct(),admin.getUserpswd(),authorities);
		}else {
			return null;
		}
		
		
	}

}
