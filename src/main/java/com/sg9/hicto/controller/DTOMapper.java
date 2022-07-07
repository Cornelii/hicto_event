package com.sg9.hicto.controller;


import org.mapstruct.Mapper;

import com.sg9.hicto.api.model.EventDto;
import com.sg9.hicto.service.vo.EventVo;

@Mapper(componentModel="spring")
public interface DTOMapper {
	EventDto toEventDto(EventVo event);
}
