package com.sanyang.logistics03.lxh.service;

import java.util.List;

import com.sanyang.logistics03.vo.Region;
import com.sanyang.logistics03.vo.Role;
import com.sanyang.logistics03.vo.SysUser;
import com.sanyang.logistics03.vo.Yhuser;

public interface YongService {
	
	
	public List<SysUser> goyonghu(SysUser sysUser);

	public void shangid(Integer user_id);

	public void insertYonghu(SysUser sysUser);

	public List<Region> chashuju();

	public List<Role> chajuese();

	public SysUser selectid(Integer user_id);

	public List<SysUser> loginuserjudgment(SysUser sysUser);

	public void updateyonghu(SysUser sysUser);
     
	
	List<SysUser> buchongfuser(SysUser sysUser);

}
