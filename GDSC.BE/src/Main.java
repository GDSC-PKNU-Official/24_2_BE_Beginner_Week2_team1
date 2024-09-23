import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgramManager pm = new ProgramManager();
        System.out.println("Welcome to GDSC PKNU!");
        System.out.println("\n\nChoose an option:");
        System.out.println("member: Show Member List");
        System.out.println("study: Show Study List");
        System.out.println("project: Show Project List");
        System.out.println("info: Show Community Information");
        System.out.println("event: Show Event List");
        System.out.println("exit: Exit Program\n\n");

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("$");


            String command = sc.nextLine();

            if(command.equals("exit")){
                break;
            }

            if(command.equals("member")){
                pm.printPeopleList();
                continue;
            }

            if(command.equals("study")){
                pm.printStudiesList();
                continue;
            }

            if(command.equals("project")){
                pm.printProjectsList();
                continue;
            }

            if(command.equals("info")){
                pm.printCommunityInformation();
                continue;
            }

            if(command.equals("event")){
                pm.printEventsList();
                continue;
            }

            System.out.println("Wrong input, try again.");

        }

    }
}