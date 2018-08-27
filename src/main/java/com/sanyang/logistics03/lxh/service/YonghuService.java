package com.sanyang.logistics03.lxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics03.lxh.dao.YonghuDao;
import com.sanyang.logistics03.lxh.mapper.YonghuMapper;
import com.sanyang.logistics03.vo.Region;
import com.sanyang.logistics03.vo.Role;
import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

@Service
public class YonghuService implements YongService{
	
	@Autowired
	YonghuDao dao;

	//查询全部
	@Override
	public List<SysUser> goyonghu(SysUser sysUser) {
		
		return dao.goyonghu(sysUser);
	}

	//删除
	@Override
	public void shangid(Integer user_id) {
		dao.shangid(user_id);
		
	}

	//添加
	@Override
	public void insertYonghu(SysUser sysUser) {

		dao.insertYonghu(sysUser);
	}

	@Override
	public List<Region> chashuju() {
		
		return dao.chashuju();
	}

	@Override
	public List<Role> chajuese() {

		return dao.chajuese();
	}

	@Override
	public SysUser selectid(Integer user_id) {

		return dao.selectid(user_id);
	}

	@Override
	public List<SysUser> loginuserjudgment(SysUser sysUser) {
		
		return dao.loginuserjudgment(sysUser);
	}

	@Override
	public void updateyonghu(SysUser sysUser) {
		
		dao.updateyonghu(sysUser);
		
	}

	@Override
	public List<SysUser> buchongfuser(SysUser sysUser) {

		return dao.buchongfuser(sysUser);
	}


}
