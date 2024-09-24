package Events;

import java.util.ArrayList;

public class Events {
    private final String eventName;
    private final Date date;
    private final String subject;
    private final String place;

    public Events(String eventName, Date date, String subject, String place) {
        this.eventName = eventName;
        this.date = date;
        this.subject = subject;
        this.place = place;
    }

    public void printEvents() {
        System.out.println("<" + eventName + ">");
        System.out.println("주제: " + subject);
        this.date.printDate();
        System.out.println("장소: " + place);
        System.out.print("\n");
    }
}
