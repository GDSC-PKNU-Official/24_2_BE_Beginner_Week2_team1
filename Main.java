//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Person
        Person gyu = new Person("gyu");
        Person nam = new Person("nam");

        // Study
        Study backend_study = new Study("Backend Study", "BE_Begineer's study");

        backend_study.post();
        backend_study.addMember(gyu);
        backend_study.addMember(nam);
        backend_study.setStatus(Study.Status.Ongoing);

        backend_study.removeMember(gyu);

        // Project
        Project pjOfClass = new Project("Making classes by Java", "Making classes teampj with BE_Beginner", "2024-12-31");

        pjOfClass.post();
        pjOfClass.addMember(gyu);
        pjOfClass.addMember(nam);
        System.out.println("Project deadline: " + pjOfClass.getDeadline());

        pjOfClass.removeMember(nam);
    }
}