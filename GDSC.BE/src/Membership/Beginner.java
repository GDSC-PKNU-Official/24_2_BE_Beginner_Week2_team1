package Membership;
import Activities.Attachment;
import Activities.Contribute;
import Activities.Networking;

class Beginner extends Membership implements Contribute, Networking, Attachment {
    protected String curriculum;


    Beginner(String domain, String curriculum) {
        super(domain);
        this.curriculum = curriculum;
    }

    @Override
    public void contribute() {
        System.out.println("프로그래밍에 대한 관심과 열정을 나눠요.");
    }

    @Override
    public void networking() {
        System.out.println("커리큘럼을 이수하며 멤버로 활동하기 위한 기반을 다져요.");
    }

    @Override
    public void attach() {
        System.out.println("GDSC의 새싹들! 활발한 활동과 개발에 대한 열정으로 함께해요.");
    }
}
