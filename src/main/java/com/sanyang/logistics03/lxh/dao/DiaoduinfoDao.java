package com.sanyang.logistics03.lxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics03.lxh.mapper.DiaoduMapper;
import com.sanyang.logistics03.vo.Schedule;

@Repository("ddao")
public class DiaoduinfoDao implements DiaoduDao {

	@Autowired
	DiaoduMapper mapper;

	@Override
	public List<Schedule> selectSchedule() {
		
		return mapper.selectSchedule();
	}
	
}
