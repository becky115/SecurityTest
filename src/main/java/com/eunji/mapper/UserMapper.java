package com.eunji.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	public Map<String, String> detailUserInfo(@Param("userId") String userId);
}
