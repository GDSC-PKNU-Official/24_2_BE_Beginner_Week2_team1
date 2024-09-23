package Membership;

import Property.Attachment;
import Property.Contribute;
import Property.Networking;

public class Member extends Membership implements Contribute, Networking, Attachment {

    public Member(String domain) {
        super(domain);
    }

    @Override
    public void contribute() {
        System.out.println("프로젝트, 스터디 등을 개설하고 참여해요.");
    }

    @Override
    public void networking() {
        System.out.println("함께 공부하고, 새로운 프로젝트를 만들어요.");
    }

    @Override
    public void attach() {
        System.out.println("다양한 사람들과 함께 성장하며 활동해요.");
    }

}
