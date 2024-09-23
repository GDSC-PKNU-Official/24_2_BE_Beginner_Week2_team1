package Events;
import java.util.ArrayList;

public class Events {
    private String eventName;
    private Date date;
    private String subject;
    private String place;

    ArrayList<Events> eventsList=new ArrayList<>();

    public Events(Date date, String subject, String place) {
        this.date = date;
        this.subject = subject;
        this.place = place;
    }

    public void printEvents(){
        System.out.println("<"+eventName+">");
        System.out.println("주제: "+subject);
        this.date.printDate();
        System.out.println("장소: "+place);
    }

    public void printEventList(){
        for(Events event:eventsList){
            System.out.println(event.eventName);
        }
    }
}
