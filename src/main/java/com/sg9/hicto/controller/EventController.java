package com.sg9.hicto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.sg9.hicto.api.HictoApi;
import com.sg9.hicto.api.model.EventDto;
import com.sg9.hicto.service.EventService;
import com.sg9.hicto.service.vo.EventVo;

import io.swagger.annotations.Api;

@Controller
@Api(tags="Hicto")
public class EventController implements HictoApi {

	private final EventService eventService;
	private final DTOMapper dtoMapper;
	
	public EventController(EventService eventService, DTOMapper dtoMapper) {
		this.eventService = eventService;
		this.dtoMapper = dtoMapper;
	}
	
	@Override
	public ResponseEntity<List<EventDto>> createEvent() {
		//TODO
		return null;
	}

	@Override
	public ResponseEntity<List<EventDto>> deleteEvent(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<EventDto>> getEvent(Long eventId) {
		List<EventDto> result = new ArrayList<>();
		
		for(EventVo eventVo: eventService.getEvent(eventId))
		{
			result.add(this.dtoMapper.toEventDto(eventVo));
		}
		
		EventDto eventDto = new EventDto();
		eventDto.setId(8L);
		eventDto.setTitle("Test Event Title1");
		eventDto.setContents("Test Event Content2");		
		result.add(eventDto);
		
		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<List<EventDto>> updateEvent(Long eventId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
