package com.sg9.hicto.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;

import com.sg9.hicto.service.EventService;
import com.sg9.hicto.service.vo.EventVo;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(EventController.class)
@ComponentScan(
		basePackageClasses = {
				DTOMapper.class
		})
public class EventControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private EventService eventService;
	
	@Test
	public void test_getEventList() throws Exception {
		
		List<EventVo> result = new ArrayList<>();
		EventVo event = new EventVo();
		event.setId(7L);
		event.setTitle("Test Event Titl1");
		event.setContents("Test Event Content1");
		result.add(event);
		
		when(eventService.getEvent(7L)).thenReturn(result);
			
		this.mvc.perform(get("/api/v1/event/5"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].title", is("Test Event Title1")));
	}
}
