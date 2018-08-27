package com.sanyang.logistics03.lxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.lxh.mapper.YonghuMapper;
import com.sanyang.logistics03.vo.Region;
import com.sanyang.logistics03.vo.Role;
import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

@Repository
public class YonghuinfoDao implements YonghuDao {
	@Autowired
	YonghuMapper mapper;
	
	@Override
	public List<SysUser> goyonghu(SysUser sysUser) {
		return mapper.goyonghu(sysUser);
	}

	@Override
	public void shangid(Integer user_id) {
		
		mapper.shangid(user_id);
		
	}

	@Override
	public void insertYonghu(SysUser sysUser) {
		
		mapper.insertYonghu(sysUser);
	}

	@Override
	public List<Region> chashuju() {

		return mapper.chashuju();
	}

	@Override
	public List<Role> chajuese() {

		return mapper.chajuese();
	}

	@Override
	public SysUser selectid(Integer user_id) {
		
		return mapper.selectid(user_id);
	}

	@Override
	public List<SysUser> loginuserjudgment(SysUser sysUser) {
	
		return mapper.loginuserjudgment(sysUser);
	}

	@Override
	public void updateyonghu(SysUser sysUser) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+sysUser.getUser_id());
		mapper.updateyonghu(sysUser);
		
	}

	@Override
	public List<SysUser> buchongfuser(SysUser sysUser) {
		
		List<SysUser> buchongfuser = mapper.buchongfuser(sysUser);
		
		return buchongfuser;
	}

	

		

	

}
