package Activity;

public class Study extends Activity {

    public Study(String activity_name, String explanation) {
        super(activity_name, explanation);
    }

    @Override
    public void printActivityInformation() {
        System.out.println(getActivityName() + " : " + getStatus() + "\n");
    }

    @Override
    public void printActivityDetails(){
        System.out.println("Activity: " + getActivityName());
        System.out.println("Explanation: " + getExplanation());
        System.out.println("Status: " + getStatus());
    }
}
