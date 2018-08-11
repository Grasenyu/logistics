package com.sanyang.logistics03.thh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics03.thh.service.IYckSerive;
import com.sanyang.logistics03.vo.PickOut;
import com.sanyang.logistics03.vo.PickoutProdBridge;
import com.sanyang.logistics03.vo.PrepareOutWarehouse;
import com.sanyang.logistics03.vo.Warehouse;

@Controller
@RequestMapping("/ccgl")
public class YckHandler {
	
	@Autowired
	private IYckSerive serive;
	
	@RequestMapping("/yck")
	@ResponseBody
	public Object yck() {
		List<Warehouse> list = serive.queryyck();
		return list;
	}
	
	@RequestMapping("/jhd")
	@ResponseBody
	public Object jhd(Integer wh_id) {
		List<PickOut> queryjhd = serive.queryjhd(wh_id);
		for (PickOut pickOut : queryjhd) {
			for (PickOut pickOuts : queryjhd) {
				String done_flag = pickOuts.getDone_flag();
				if (done_flag.equals("Y")) {
					pickOuts.setDone_flag("拣货完成");
				}
				if (done_flag.equals("N")) {
					pickOuts.setDone_flag("等待拣货");
				}
			}
		}
		return queryjhd;
	}
	
	@RequestMapping("/dck")
	@ResponseBody
	public Object dck(Integer pickout_id) {
			List<PickoutProdBridge> querydck = serive.querydck(pickout_id);
			return querydck;
	}

	
	@RequestMapping("/yckb")
	@ResponseBody
	public Object yckb(Integer pickout_id) {
			List<PrepareOutWarehouse> queryckb = serive.queryyckb(pickout_id);
			return queryckb;
	}
	
	@RequestMapping("/up")
	@ResponseBody
	public Object up(PickoutProdBridge pickoutProdBridge) {
		serive.up(pickoutProdBridge);
		serive.del();
		return "123";
	}
	
	
	@RequestMapping("/dely")
	@ResponseBody
	public Object dely(Integer preout_id) {
		serive.dely(preout_id);
			return "456";
	}
	
	
	@RequestMapping("/upjhd")
	@ResponseBody
	public Object upjhd(PickOut pickOut) {
		serive.upjhd(pickOut);
		return "789";
	}
	
}
