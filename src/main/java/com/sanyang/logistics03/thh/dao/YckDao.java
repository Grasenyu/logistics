package com.sanyang.logistics03.thh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.vo.PickOut;
import com.sanyang.logistics03.vo.PickoutProdBridge;
import com.sanyang.logistics03.vo.PrepareOutWarehouse;
import com.sanyang.logistics03.vo.Warehouse;


public interface YckDao {
	
	List<Warehouse> queryyck();
	
	List<PickOut> queryjhd(Integer wh_id);
	
	List<PickoutProdBridge> querydck(Integer pickout_id);
	
	List<PrepareOutWarehouse> queryyckb(Integer pickout_id);
	
	void up(PickoutProdBridge pickoutProdBridge);
	
	void del();
	
	void dely(Integer preout_id);
	
	void upjhd(PickOut PickOut);


}
