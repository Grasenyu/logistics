package com.sanyang.logistics03.lxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.lxh.mapper.LoginMapper;
import com.sanyang.logistics03.vo.SysUser;

@Repository("logindao")
public class LoginDao implements LogindDao {
	
	@Autowired
	LoginMapper mapper;

	@Override
	public SysUser dengluindex(SysUser sysUser) {
	
		return mapper.dengluindex(sysUser);
	}




}
