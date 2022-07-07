package com.sg9.hicto.service;

import java.util.List;

import com.sg9.hicto.service.vo.EventVo;

public interface EventService {
	
	List<EventVo> getEvent(Long id);
	
}
