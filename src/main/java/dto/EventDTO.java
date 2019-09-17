/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Event;

/**
 *
 * @author emilt
 */
public class EventDTO {
    
    private String event_imgUrl;
    private String event_title;
    private String event_body;
    private boolean event_active;

    public EventDTO(Event event) {
        this.event_imgUrl = event.getImgUrl();
        this.event_title = event.getTitle();
        this.event_body = event.getBody();
        this.event_active = event.isActive();
    }

    public String getEvent_imgUrl() {
        return event_imgUrl;
    }

    public void setEvent_imgUrl(String event_imgUrl) {
        this.event_imgUrl = event_imgUrl;
    }

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public String getEvent_body() {
        return event_body;
    }

    public void setEvent_body(String event_body) {
        this.event_body = event_body;
    }

    public boolean isEvent_active() {
        return event_active;
    }

    public void setEvent_active(boolean event_active) {
        this.event_active = event_active;
    }
    
    
    
}
