package com.eunji.service;

import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eunji.mapper.UserMapper;

@Service
public class LoginLogoutService {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String PASSWD_SALT = "Hi Connectome!";

	public static String createPasswd(String userPass) {
		return DigestUtils.sha256Hex(userPass + PASSWD_SALT);
	}
	
	public boolean loginCheck(String userId, String userPass) {
		UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);
		Map<String, String> userInfo = userMapper.detailUserInfo(userId);
		if(userInfo != null){
			String passwd = userInfo.get("passwd");
			System.out.println("passwd: "+ passwd);
		}
		
		return false;
	}
	
	public Map<?, ?> getUserInfo(String userId){
		UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);
		Map<String, String> userInfo = userMapper.detailUserInfo(userId);
		return userInfo;
	}



}
