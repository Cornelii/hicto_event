package com.sg9.hicto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sg9.hicto.service.vo.EventVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EventServiceImpl implements EventService {

	@Override
	public List<EventVo> getEvent(Long id) {
		// TODO Auto-generated method stub
		log.info("getEvent@Service");
		
		List<EventVo> result = new ArrayList<>();
		
		EventVo event = new EventVo();
		event.setId(7L);
		event.setTitle("Test Event Title1");
		event.setContents("Test Event Content1");
		result.add(event);
		
		return result;
	}

}
