package com.sg9.hicto.service.vo;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class EventVo {
	
	private Long id;
	
	private String title;
	
	private String contents;
	
	private OffsetDateTime updatedAt;
	
	private OffsetDateTime createdAt;
}
