import Membership.Membership;
import Activity.Activity;

public class Person {
    private Information information;
    private Membership membership;
    private Activity activity;

    public Person(Information information, Membership membership, Activity activity) {
        this.information = information;
        this.membership = membership;
        this.activity = activity;
    }

    public Information getInformation() {
        return information;
    }
    public void setInformation(Information information) {
        this.information = information;
    }

    public Membership getMembership() {
        return membership;
    }
    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Activity getActivity() {
        return activity;
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void printPersonInfo() {
        System.out.println("⭐회원 정보:");
        information.printInfo();
        System.out.println("📈회원 구분:");
        membership.contribute();
        membership.networking();
        membership.attach();
        System.out.println("🎯활동 내역:");
        System.out.println("참여 활동 상태: " + activity.getStatus());
        activity.showMembers();
    }
}