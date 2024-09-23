import Activity.Activity;
import Membership.GDSCMember;

import java.util.ArrayList;

public class Person {
    private PersonalInformation information;
    private GDSCMember GDSCMember;
    private Activity activity;

    private final ArrayList<Person> memberList = new ArrayList<>();

    public Person(PersonalInformation information, GDSCMember GDSCMember) {
        this.information = information;
        this.GDSCMember = GDSCMember;
    }

    public PersonalInformation getInformation() {
        return information;
    }

    public void setInformation(PersonalInformation information) {
        this.information = information;
    }

    public GDSCMember getMembership() {
        return GDSCMember;
    }

    public void setMembership(GDSCMember GDSCMember) {
        this.GDSCMember = GDSCMember;
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
//        printActivityInfo();
    }

    private void printBasicInfo() {
        System.out.println("⭐회원 정보:");
        information.printInfo();
    }

    private void printMembershipInfo() {
        System.out.println("📈회원 구분:");
        GDSCMember.contribute();
        GDSCMember.networking();
        GDSCMember.attach();
    }

//    private void printActivityInfo() {
//        System.out.println("🎯활동 내역:");
//        System.out.println("참여 활동 상태: " + activity.getStatus());
//        activity.showMembers();
//    }
}