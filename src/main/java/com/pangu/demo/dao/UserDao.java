package com.pangu.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pangu.demo.domain.User;


public interface UserDao {
	
	@Select("select store_id as code, store_name as username, REMARK name\r\n" + 
			"        from TB_BS_STORE \r\n" + 
			"         where store_id=#{userName}")
	User findUserByName(@Param("userName") String userName);
}
