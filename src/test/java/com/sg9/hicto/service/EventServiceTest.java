package com.sg9.hicto.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sg9.hicto.service.vo.EventVo;

public class EventServiceTest {
	
	@Test
	public void test_getEvent() {
		EventService eventService = new EventServiceImpl();
		
		List<EventVo> list = eventService.getEvent(7L);
		assertThat(list).extracting("id", "title").contains(
				tuple(7L, "Test Event Title1")
				);
	}
}
