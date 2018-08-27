package com.sanyang.logistics03.lxh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics03.lxh.service.LogindService;
import com.sanyang.logistics03.vo.SysUser;

@Controller
@RequestMapping("/syslogin")
public class LoginHandlerSec {
	
	@Autowired
	LogindService service;
	
	@RequestMapping("/goindexs")
	@ResponseBody
	public Object goindex(SysUser sysUser){
		SysUser lSysUser = service.dengluindex(sysUser);
		System.out.println(lSysUser);
		if (lSysUser==null) {
			return "1";
		}
		return lSysUser;		
		
	}
	

}
