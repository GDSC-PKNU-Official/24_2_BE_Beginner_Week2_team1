import Activity.Activity;
import Membership.GDSCMember;

import java.util.ArrayList;

public class Person {
    private PersonalInformation information;
    private GDSCMember GDSCMember;
    private ArrayList<Activity> joinedActivities = new ArrayList<>();

    public Person(PersonalInformation information, GDSCMember GDSCMember, ArrayList<Activity> activities) {
        this.information = information;
        this.GDSCMember = GDSCMember;
        this.joinedActivities = activities;
    }

    public void printPersonInfo() {
        printBasicInfo();
        System.out.print("\n");
        printMembershipInfo();
        System.out.print("\n");
        printActivityInfo();
        System.out.print("\n");
    }

    private void printBasicInfo() {
        System.out.println("⭐회원 정보:");
        information.printInfo();
    }

    private void printMembershipInfo() {
        System.out.println("📈회원 구분: " + GDSCMember.getGrade());
        GDSCMember.contribute();
        GDSCMember.networking();
        GDSCMember.attach();
    }

    private void printActivityInfo() {
        System.out.println("🎯활동 내역:");
        if (joinedActivities.isEmpty()) {
            System.out.println("존재하지 않음");
            return;
        }
        for (Activity activity : joinedActivities) {
            activity.printActivityInformation();
        }
    }
}