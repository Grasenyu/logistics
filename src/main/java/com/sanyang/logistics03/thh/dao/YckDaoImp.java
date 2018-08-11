package com.sanyang.logistics03.thh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.thh.mapper.YckMapper;
import com.sanyang.logistics03.vo.PickOut;
import com.sanyang.logistics03.vo.PickoutProdBridge;
import com.sanyang.logistics03.vo.PrepareOutWarehouse;
import com.sanyang.logistics03.vo.Warehouse;

@Repository("dao")
public class YckDaoImp implements YckDao{
	
	@Autowired
	private YckMapper mapper;

	@Override
	public List<Warehouse> queryyck() {
		// TODO Auto-generated method stub
				List<Warehouse> queryyck = mapper.queryyck();
				return queryyck;
	}

	@Override
	public List<PickOut> queryjhd(Integer wh_id) {
		// TODO Auto-generated method stub
	List<PickOut> queryjhd = mapper.queryjhd(wh_id);
			return queryjhd;
	}

	@Override
	public List<PickoutProdBridge> querydck(Integer pickout_id) {
		// TODO Auto-generated method stub
		List<PickoutProdBridge> querydck = mapper.querydck(pickout_id);
		return querydck;
	}

	@Override
	public List<PrepareOutWarehouse> queryyckb(Integer pickout_id) {
		// TODO Auto-generated method stub
		List<PrepareOutWarehouse> queryckb = mapper.queryyckb(pickout_id);
		return queryckb;
	}

	@Override
	public void up(PickoutProdBridge pickoutProdBridge) {
		// TODO Auto-generated method stub
		mapper.up(pickoutProdBridge);
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub
		mapper.del();
	}

	@Override
	public void dely(Integer preout_id) {
		// TODO Auto-generated method stub
		mapper.dely(preout_id);
	}

	@Override
	public void upjhd(PickOut pickOut) {
		// TODO Auto-generated method stub
		mapper.upjhd(pickOut);
	}

	



}
