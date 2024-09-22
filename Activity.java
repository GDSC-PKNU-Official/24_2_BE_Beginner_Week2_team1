import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public abstract class Activity {
    private String activity_name;
    private String explanation;
    private List<Person> members;
    private boolean isExisted;

    public Activity(String activity_name, String explanation) {
        this.activity_name = activity_name;
        this.explanation = explanation;
        this.members = new ArrayList<>();
        this.isExisted = false;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void post(){
        if(!isExisted){
            isExisted = true;
            System.out.println(activity_name + " has been posted.");
        } else{
            System.out.println(activity_name + " has already been posted.");
        }
    }

    public void addMember(Person member){
        members.add(member);
        System.out.println(member.getName() + " has been added to the list.");
    }

    public void removeMember(Person member){
        if(members.contains(member)){
            members.remove(member);
            System.out.println(member.getName() + " has been removed from the list.");
        } else{
            System.out.println(member.getName() + " has not existed");

        }
    }
}
