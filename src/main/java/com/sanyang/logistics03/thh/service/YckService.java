package com.sanyang.logistics03.thh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.thh.dao.YckDao;
import com.sanyang.logistics03.vo.PickOut;
import com.sanyang.logistics03.vo.PickoutProdBridge;
import com.sanyang.logistics03.vo.PrepareOutWarehouse;
import com.sanyang.logistics03.vo.Warehouse;
@Repository("seriver")
public class YckService implements IYckSerive{
	@Autowired
	private YckDao dao;

	@Override
	public List<Warehouse> queryyck() {
		// TODO Auto-generated method stub
		return dao.queryyck();
	}

	@Override
	public List<PickOut> queryjhd(Integer wh_id) {
		// TODO Auto-generated method stub
		return dao.queryjhd(wh_id);
	}

	@Override
	public List<PickoutProdBridge> querydck(Integer pickout_id) {
		// TODO Auto-generated method stub
		return dao.querydck(pickout_id);
	}

	@Override
	public List<PrepareOutWarehouse> queryyckb(Integer pickout_id) {
		// TODO Auto-generated method stub
		return dao.queryyckb(pickout_id);
	}

	@Override
	public void up(PickoutProdBridge pickoutProdBridge) {
		// TODO Auto-generated method stub
		dao.up(pickoutProdBridge);
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub
		dao.del();
	}

	@Override
	public void dely(Integer preout_id) {
		// TODO Auto-generated method stub
		dao.dely(preout_id);
	}

	@Override
	public void upjhd(PickOut pickOut) {
		// TODO Auto-generated method stub
		dao.upjhd(pickOut);
	}
	
	

}
