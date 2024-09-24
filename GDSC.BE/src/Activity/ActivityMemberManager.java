package Activity;

import Exception.MemberAlreadyExistsException;
import Exception.MemberNotExistException;

import java.util.Scanner;

public class ActivityMemberManager {
    public void manageActivityManger(Scanner sc, Activity activity){
        String choice;

        while (true) {
            System.out.println("1. 멤버 추가 / 2. 멤버 제거");
            System.out.println("'1' 또는 '2'로 입력해주세요");

            choice = sc.nextLine();

            if (choice.equals("1") || choice.equals("2")) {
                break;
            } else {
                System.out.println("1과 2 중 입력해주세요.");
            }
        }

        System.out.println("멤버 이름을 입력해주세요");
        String memberName = sc.nextLine();

        try{
            if(choice.equals("1")){
                activity.addMember(memberName);
            }else if(choice.equals("2")){
                activity.removeMember(memberName);
            }
        } catch (MemberAlreadyExistsException | MemberNotExistException e){
            System.out.println(e.getMessage());
        }
    }
}
