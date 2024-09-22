package GDSC.BE.src.Activity;
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
    private List<String> members;

    public Activity(String activity_name, String explanation) {
        this.activity_name = activity_name;
        this.explanation = explanation;
        this.members = new ArrayList<String>();
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void addMember(String member){
        members.add(member);
        System.out.println(member + " has been added to the list.");
    }

    public void removeMember(String member){
        if(members.contains(member)){
            members.remove(member);
            System.out.println(member + " has been removed from the list.");
        } else{
            System.out.println(member + " has not existed");

        }
    }

    public void showMembers(){
        if(members.isEmpty()){
            System.out.println(activity_name + "is empty");
        }
        else{
            for(String member : members){
                System.out.println(member + ",");
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
