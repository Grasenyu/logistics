package com.sanyang.logistics03.lxh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics03.lxh.service.YongService;
import com.sanyang.logistics03.lxh.service.YonghuService;
import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

@Controller
@RequestMapping("/yong")
public class YonghuHandler {
	
	@Autowired
	YongService dService;
	
	//查询
	@RequestMapping("/goyonghu")
	@ResponseBody
	public Object goyonghu(){
		List<SysUser>  SysUser= dService.goyonghu();
		System.out.println(SysUser);
		return SysUser ;
	}
	
	//删除
	@RequestMapping("/deleteYonghu")
	@ResponseBody
	public void deleteYonghu(Integer user_id){
		System.out.println("sds");
		dService.shangid(user_id);
		
	}
	
	//添加
	@RequestMapping("/tianjiayonghu")
	@ResponseBody
	public Object tianjiayonghu(SysUser sysUser){
		
		dService.insertYonghu(sysUser);
		return "data";
		
		
	}
	
	//模糊查询

	
	
	
}
