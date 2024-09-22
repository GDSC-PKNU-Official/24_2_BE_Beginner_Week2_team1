import java.util.ArrayList;
import java.util.List;

public abstract class Activity {
    enum Status {
        Gathering,
        Ongoing,
        Completed
    }
    protected Status status;
    private String activity_name;
    private String explanation;
    private List<Person> members;

    public Activity(String activity_name, String explanation) {
        this.activity_name = activity_name;
        this.explanation = explanation;
        this.members = new ArrayList<>();
    }

    public String getActivity_name() {
        return activity_name;
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

    public void showMembers(){
        if(members.isEmpty()){
            System.out.println(activity_name + "is empty");
        }
        else{
            for(Person member : members){
                System.out.println(member.getName() + ",");
            }
        }
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println(getActivity_name() + "의 상태가 " + status + "로 설정되었습니다.");
    }

    public Status getStatus() {
        return status;
    }
}
