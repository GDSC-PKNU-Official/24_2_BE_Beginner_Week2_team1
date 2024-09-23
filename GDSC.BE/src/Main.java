import Activity.*;
import Membership.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to GDSC PKNU!");
        System.out.println("\n\nChoose an option:");
        System.out.println("member: Show Member List");
        System.out.println("study: Show Study List");
        System.out.println("project: Show Project List");
        System.out.println("info: Show Community Information");
        System.out.println("event: Show Event List");
        System.out.println("exit: Exit Program\n\n");

        while(true){
            System.out.println("$");

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();

            if(command.equals("exit")){
                break;
            }

            if(command.equals("member")){
                ProgramManager.printPeopleList();
                continue;
            }

            if(command.equals("study")){
                ProgramManager.printStudiesList();
                continue;
            }

            if(command.equals("project")){
                ProgramManager.printProjectsList();
                continue;
            }

            if(command.equals("info")){
                ProgramManager.printCommunityInformation();
                continue;
            }

            if(command.equals("event")){
                ProgramManager.printEventsList();
                continue;
            }

            System.out.println("Wrong input, try again.\n");

        }

    }
}
