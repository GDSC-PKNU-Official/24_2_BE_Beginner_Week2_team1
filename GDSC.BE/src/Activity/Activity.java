package Activity;

import Exception.MemberAlreadyExistsException;
import Exception.MemberNotExistException;

import java.util.ArrayList;
import java.util.List;

public abstract class Activity {
    enum Status {
        Gathering,
        Ongoing,
        Completed
    }

    protected Status status;
    private final String activityName;
    private final String explanation;
    private final List<String> members;


    public Activity(String activityName, String explanation) {
        this.status = Status.Gathering;
        this.activityName = activityName;
        this.explanation = explanation;
        this.members = new ArrayList<String>();
    }

    public String getActivityName() {
        return activityName;
    }

    public String getExplanation() {
        return explanation;
    }


    public void addMember(String member) throws MemberAlreadyExistsException {
        if (members.contains(member)) {
            throw new MemberAlreadyExistsException(member + "is already existed");
        } else {
            members.add(member);
            System.out.println(member + " has been added to the list.");
        }

    }

    public void removeMember(String member) throws MemberNotExistException {
        if (members.contains(member)) {
            members.remove(member);
            System.out.println(member + " has been removed from the list.");
        } else {
            throw new MemberNotExistException(member + "is not existed");

        }
    }

    public void showMembers() {
        if (members.isEmpty()) {
            System.out.println(activityName + "는 현재 아무도 가입하지 않았습니다.");
            return;
        }
        for (String member : members) {
            System.out.println(member + ",");
        }
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println(getActivityName() + "의 상태가 " + status + "로 설정되었습니다.");
    }

    public Status getStatus() {
        return status;
    }

    public void printActivityInformation() {
        System.out.println("informaion");
    }

    public void printActivityDetails() {
        System.out.println("Details");
    }
}
