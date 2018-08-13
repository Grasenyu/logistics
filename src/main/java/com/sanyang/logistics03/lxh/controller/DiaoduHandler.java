package com.sanyang.logistics03.lxh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics03.lxh.service.DiaoduService;
import com.sanyang.logistics03.vo.Schedule;

@Controller
@RequestMapping("/diao")
public class DiaoduHandler {
	
	@Autowired
	DiaoduService diaoduService;
	
	//查询
	@RequestMapping("/godiaodu")
	@ResponseBody
	public Object godiaodu(){
		
		List<Schedule> lSchedule = diaoduService.selectSchedule();
		
		return lSchedule;
	}

}
