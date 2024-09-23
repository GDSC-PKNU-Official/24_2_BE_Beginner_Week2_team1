import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandHelper commandHelper = new CommandHelper();
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
                continue;
            }

            if (command.equals("project")) {
                commandHelper.printProjectsList();
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