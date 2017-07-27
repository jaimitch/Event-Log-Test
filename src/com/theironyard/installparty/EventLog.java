package com.theironyard.installparty;

import java.util.ArrayList;
import java.util.List;
import static com.theironyard.installparty.Event.*;



public class EventLog {

    private static List<Event> eventList =  new ArrayList<>();


    public static boolean addEvent(Event event) {

        if( event == null || name == null || action == null) {
            throw new IllegalArgumentException();
        }
        else if (action != "Face2Face" || action != "PhoneCall" || action != "TextMessaging" || action != "Unknown"){
            throw new AssertionError();
        }
        else {
            System.out.println(event);
            eventList.add(event);
        }

            return true;

    }

    public int getNumEvents() {

        return eventList.size();
    }

    public EventLog() {

        Event event = new Event();
    }

}

