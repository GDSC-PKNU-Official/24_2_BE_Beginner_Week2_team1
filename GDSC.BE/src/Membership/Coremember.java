package Membership;

public class Coremember extends GDSCMember {
    protected String department;

    public Coremember(String domain, String department) {
        super(domain);
        this.department = department;
    }

    @Override
    public void contribute() {
        System.out.println("행사 기획, 대회 협력, 홍보 등 운영 전반을 맡고 있어요.");
    }

    @Override
    public void networking() {
        System.out.println("회원들이 함께 네트워킹할 수 있는 기회를 만들어요.");
    }

    @Override
    public void attach() {
        System.out.println("GDSC에 대한 애정을 갖고 함께 성장하는 커뮤니티를 만들어요.");
    }

    @Override
    public String getGrade() {
        return "코어 멤버";
    }
}
