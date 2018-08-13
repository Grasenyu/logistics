package com.sanyang.logistics03.lxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.lxh.mapper.YonghuMapper;
import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

@Repository
public class YonghuinfoDao implements YonghuDao {
	@Autowired
	YonghuMapper mapper;
	
	@Override
	public List<SysUser> goyonghu() {
		return mapper.goyonghu();
	}

	@Override
	public void shangid(Integer user_id) {
		
		mapper.shangid(user_id);
		
	}

	@Override
	public void insertYonghu(SysUser sysUser) {
		
		mapper.insertYonghu(sysUser);
	}

	

		

	

}
