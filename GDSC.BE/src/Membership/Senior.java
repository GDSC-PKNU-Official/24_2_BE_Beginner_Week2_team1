package Membership;

public class Senior extends GDSCMember {

    public Senior(String domain) {
        super(domain);
    }

    @Override
    public void contribute() {
        System.out.println("세션 등의 방법으로 정보를 제공해요.");
    }

    @Override
    public void networking() {
        System.out.println("정기모임, 스터디 등에 참여해 사람들과 지식을 나눠요.");
    }

    @Override
    public void attach() {
        System.out.println("GDSC에 대한 애정으로 오랜 기간 활동하며 기여해주고 있어요.");
    }

    @Override
    public String getGrade() {
        return "시니어";
    }
}
