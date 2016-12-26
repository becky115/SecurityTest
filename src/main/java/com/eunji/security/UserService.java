package com.eunji.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.eunji.service.LoginLogoutService;

public class UserService implements UserDetailsService {
	
	@Autowired
	LoginLogoutService loginLogoutService;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		//LoginLogoutService.loginCheck(userId, userPass);
		
//		User user = new User();
//
//		user.setUsername(username);
//		user.setPassword(password);
//
//		Role role = new Role();
//		role.setName("ROLE_USER");
//
//		List<Role> roles = new ArrayList<Role>();
//		roles.add(role);
//		user.setAuthorities(roles);
		System.out.println("userId: " + userId);
		System.out.println(loginLogoutService);
		Map<?, ?> userInfo = loginLogoutService.getUserInfo(userId);
		System.out.println(userInfo);
		String password = (String) userInfo.get("passwd");
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		
		String roldId = (String) userInfo.get("role_id");
		list.add(new SimpleGrantedAuthority(roldId));
		
		UserDetails user = new User(userId, password, list);
		System.out.println(user);
		return user;
	}


}
