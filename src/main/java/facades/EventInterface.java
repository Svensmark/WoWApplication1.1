/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.EventDTO;
import entities.Event;
import java.util.ArrayList;

/**
 *
 * @author emilt
 */
public interface EventInterface {
    
    public Event addEvent(Event event);
    
    public void deleteEvent(Event event);
    
    public ArrayList<Event> getAllEvents();
    
    public ArrayList<EventDTO> getAllEventsDTO();
        
}
