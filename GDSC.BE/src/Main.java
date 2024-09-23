import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgramManager pm = new ProgramManager();
        System.out.println(InitialInformation.GREETING);

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