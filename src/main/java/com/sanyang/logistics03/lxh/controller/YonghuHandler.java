package com.sanyang.logistics03.lxh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics03.lxh.service.YongService;
import com.sanyang.logistics03.lxh.service.YonghuService;
import com.sanyang.logistics03.vo.Region;
import com.sanyang.logistics03.vo.Role;
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
	public Object goyonghu(SysUser sysUser){
		List<SysUser>  us= dService.goyonghu(sysUser);
		return us ;
	}
	
	//删除
	@RequestMapping("/deleteYonghu")
	@ResponseBody
	public void deleteYonghu(Integer user_id){
		
		dService.shangid(user_id);
		
	}
	
	//添加
	@RequestMapping("/tianjiayonghu")
	@ResponseBody
	public Object tianjiayonghu(SysUser sysUser){
		
		dService.insertYonghu(sysUser);
		return "data";
		
		
	}
	
	
	//查询地址
	@RequestMapping("/chashuju")
	@ResponseBody
	public Object chashuju() {
		List<Region>  Region= dService.chashuju();
		return Region ;
		
	}
	
	
	//查角色
	@RequestMapping("/chajuese")
	@ResponseBody
	public Object chajuese(){
		
		List<Role> roles = dService.chajuese();
		return roles;
	}
	
	@RequestMapping("/buchongfuser")
	@ResponseBody
	public Object loginuserjudgment(SysUser sysUser) {
		List<SysUser> buchongfuser = dService.buchongfuser(sysUser);
		System.out.println(buchongfuser);
		if (buchongfuser.size()>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	
	//拿id赋值给修改界面
	@RequestMapping("/getidxiu")
	@ResponseBody
	public Object getidxiu(Integer user_id){
		
		SysUser selectid = dService.selectid(user_id);
		System.out.println(selectid);
		return selectid;
	}
	
	//修改
	@RequestMapping("/updateyonghu")
	@ResponseBody
	public Object updateyonghu(SysUser sysUser){
		System.out.println(sysUser.getUser_id()+"<<<<<<<");
		dService.updateyonghu(sysUser);
		return "data";
		
		
		
	}
	
	
}
