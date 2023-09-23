package com.github.krilexis.warframelatest.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.krilexis.warframelatest.dto.EventDto;
import com.github.krilexis.warframelatest.mapper.EventMapper;
import com.github.krilexis.warframelatest.service.EventService;

@RestController("/api")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public List<EventDto> getEvents() {
        return eventService.getEvents().stream().map(e -> EventMapper.mapToDto(e)).toList();
        
    }


}
