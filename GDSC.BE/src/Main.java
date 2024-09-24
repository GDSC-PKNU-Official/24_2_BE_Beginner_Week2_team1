import Activity.ActivityMemberManager;
import Activity.Project;
import Activity.Study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandHelper commandHelper = new CommandHelper();
        ActivityMemberManager activityMemberManager = new ActivityMemberManager();
        System.out.println(InitialInformation.GREETING);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("$");


            String command = sc.nextLine();

            if (command.equals("exit")) {
                break;
            }

            if (command.equals("member")) {
                commandHelper.printPeopleList();
                continue;
            }

            if (command.equals("study")) {
                commandHelper.printStudiesList();
                System.out.println("어떤 스터디에 참가하시겠습니까?");
                String studyName = sc.nextLine();
                Study selectedStudy = commandHelper.getStudyByName(studyName);

                if(selectedStudy != null){
                    activityMemberManager.manageActivityManger(sc, selectedStudy);
                } else {
                    System.out.println("해당 이름을 가진 스터디는 존재하지 않습니다.");
                }
                continue;
            }

            if (command.equals("project")) {
                commandHelper.printProjectsList();
                System.out.println("어떤 프로젝트에 참가하시겠습니까?");
                String projectName = sc.nextLine();
                Project selectedProject = commandHelper.getProjectByName(projectName);

                if(selectedProject != null){
                    activityMemberManager.manageActivityManger(sc, selectedProject);
                } else{
                    System.out.println("해당 이름을 가진 프로젝트는 존재하지 않습니다.");
                }
                continue;
            }

            if (command.equals("info")) {
                commandHelper.printCommunityInformation();
                continue;
            }

            if (command.equals("event")) {
                commandHelper.printEventsList();
                continue;
            }

            System.out.println("Wrong input, try again.");

        }

    }
}