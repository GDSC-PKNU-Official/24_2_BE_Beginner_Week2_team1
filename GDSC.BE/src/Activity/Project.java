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

    @Override
    public void printActivityInformation() {
        System.out.println(getActivityName() + " : " + getStatus());
    }
}