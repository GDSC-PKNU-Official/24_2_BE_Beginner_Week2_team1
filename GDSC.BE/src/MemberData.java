import java.util.ArrayList;
import java.util.List;

public class MemberData {
    private List<String> members;

    public MemberData() {
        members = new ArrayList<>();
        displayMembers();
    }

    private void addSampleData() {
        members.add("김규남(B): @gyu-nam");
        members.add("김서영(C): @Cloie-Kim");
        members.add("이효진(B): @ll0zlk");
        members.add("조원준(B): @jwjdd");
    }

    private void displayMembers() {
        addSampleData();
        System.out.println("Member List:");
        for (String member : members) {
            System.out.println(member);
        }
    }
}
