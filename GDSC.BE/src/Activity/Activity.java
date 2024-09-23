package Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Exception.*;

public abstract class Activity {
    enum Status {
        Gathering,
        Ongoing,
        Completed
    }

    protected Status status;
    private String activityName;
    private String explanation;
    private List<String> members;

    public Activity(String activityName, String explanation) {
        this.activityName = activityName;
        this.explanation = explanation;
        this.members = new ArrayList<String>();
    }

    public String getActivityName() {
        return activityName;
    }


    public void addMember(String member) throws MemberAlreadyExistsException {
       if(members.contains(member)){
           throw new MemberAlreadyExistsException(member + "is already existed");
        } else{
           members.add(member);
           System.out.println(member + " has been added to the list.");
       }

    }

    public void removeMember(String member) throws MemberNotExistException {
        if(members.contains(member)){
            members.remove(member);
            System.out.println(member + " has been removed from the list.");
        } else{
            throw new MemberNotExistException(member + "is not existed");

        }
    }

    public Optional<List<String>> showMembers(){
        if(members.isEmpty()){
            System.out.println(activityName + "is empty");
            return Optional.empty();
        } else{
            for(String member : members){

                System.out.println(member + ",");
            }
            return Optional.of(members);
        }
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println(getActivityName() + "의 상태가 " + status + "로 설정되었습니다.");
    }

    public Status getStatus() {
        return status;
    }
}
