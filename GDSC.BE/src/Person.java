import Membership.Membership;
import Activity.Activity;

public class Person {
    private PersonalInformation information;
    private Membership membership;
    private Activity activity;

    public Person(PersonalInformation information, Membership membership, Activity activity) {
        this.information = information;
        this.membership = membership;
        this.activity = activity;
    }

    public PersonalInformation getInformation() {
        return information;
    }

    public void setInformation(PersonalInformation information) {
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
        printBasicInfo();
        printMembershipInfo();
        printActivityInfo();
    }

    private void printBasicInfo() {
        System.out.println("⭐회원 정보:");
        information.printInfo();
    }

    private void printMembershipInfo() {
        System.out.println("📈회원 구분:");
        membership.contribute();
        membership.networking();
        membership.attach();
    }

    private void printActivityInfo() {
        System.out.println("🎯활동 내역:");
        System.out.println("참여 활동 상태: " + activity.getStatus());
        activity.showMembers();
    }
}