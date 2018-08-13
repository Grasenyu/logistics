package com.sanyang.logistics03.lxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics03.lxh.dao.DiaoduDao;
import com.sanyang.logistics03.vo.Schedule;

@Service
public class DiaoduinfoService implements DiaoduService {
	
	@Autowired
	DiaoduDao dao;

	@Override
	public List<Schedule> selectSchedule() {
		return dao.selectSchedule();
	}

}
