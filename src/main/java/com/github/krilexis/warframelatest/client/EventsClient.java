package com.github.krilexis.warframelatest.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.github.krilexis.warframelatest.model.Event;

@Service
public class EventsClient {

    @Value("${api.warframestat.root}")
    private String apiWarframeRoot;

    @Value("${events.path}")
    private String eventsPath;

    private final RestTemplate restTemplate;

    private final Logger logger;

    public EventsClient(RestTemplate restTemplate, Logger logger) {
        this.restTemplate = restTemplate;
        this.logger = logger;
    }

    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        ParameterizedTypeReference<List<Event>> typeRef = new ParameterizedTypeReference<List<Event>>() {
        };
        try {
            events = restTemplate.exchange(apiWarframeRoot + eventsPath, HttpMethod.GET, null, typeRef).getBody();
        } catch (RestClientException e) {
            logger.error("Error while loading events", e);
        }
        return events;
    }
}
