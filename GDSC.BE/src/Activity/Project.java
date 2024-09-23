package Activity;

public class Project extends Activity {
    private final String deadline;

    public Project(String activity_name, String explanation, String deadline) {
        super(activity_name, explanation);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    public void printProject() {
        System.out.println(getActivityName() + ": " + getStatus() + "\n");
    }
}