/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Park;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class Events {
    
    ArrayList<Event> eventList = new ArrayList<>();

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }

    public ArrayList<Event> getEventsForPark(int id) {
        ArrayList<Event> events = new ActivatableArrayList<>();
        for(Event event: eventList)
        {
            if(event.getParkId() == id)
                events.add(event);
        }
        return events;
        
    }
    
    
    public ArrayList<Event> findEventsForPark(int id)
    {
       ArrayList<Event> events = new ArrayList<>();
       for(Event event: eventList)
       {
           if(event.getParkId() == id)
               events.add(event);
       }
       return events;
    }
    
    
    
}
