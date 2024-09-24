package Activity;

public class Project extends Activity {
    private final String deadline;

    public Project(String activity_name, String explanation, String deadline) {
        super(activity_name, explanation);
        this.deadline = deadline;
    }

    @Override
    public void printActivityInformation() {
        System.out.println(getActivityName() + " : " + getStatus());
    }

    @Override
    public void printActivityDetails() {
        System.out.println("Activity: " + getActivityName());
        System.out.println("Explanation: " + getExplanation());
        System.out.println("Deadline: " + deadline);
        System.out.println("Status: " + getStatus());
    }
}