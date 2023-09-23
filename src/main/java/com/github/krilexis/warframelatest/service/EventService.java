package com.github.krilexis.warframelatest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.krilexis.warframelatest.client.EventsClient;
import com.github.krilexis.warframelatest.model.Event;

@Service
public class EventService {

    private final EventsClient eventsClient;

    public EventService(EventsClient eventsClient) {
        this.eventsClient = eventsClient;
    }

    public List<Event> getEvents() {
        return eventsClient.getEvents();
    }
    
}
