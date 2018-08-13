package com.sanyang.logistics03.lxh.dao;

import java.util.List;

import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

public interface YonghuDao {


	public List<SysUser> goyonghu();

	public void shangid(Integer user_id);

	public void insertYonghu(SysUser sysUser);


}
