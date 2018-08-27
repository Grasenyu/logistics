package com.sanyang.logistics03.lxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics03.lxh.dao.LogindDao;
import com.sanyang.logistics03.vo.SysUser;

@Service
public class LoginService implements LogindService {
	
	@Autowired
	LogindDao dao;

	@Override
	public SysUser dengluindex(SysUser sysUser) {
		
		return dao.dengluindex(sysUser);
	}

	

}
