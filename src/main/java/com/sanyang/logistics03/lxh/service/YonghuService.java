package com.sanyang.logistics03.lxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics03.lxh.dao.YonghuDao;
import com.sanyang.logistics03.lxh.mapper.YonghuMapper;
import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

@Service
public class YonghuService implements YongService{
	
	@Autowired
	YonghuDao dao;

	//查询全部
	@Override
	public List<SysUser> goyonghu() {
		
		return dao.goyonghu();
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


}
