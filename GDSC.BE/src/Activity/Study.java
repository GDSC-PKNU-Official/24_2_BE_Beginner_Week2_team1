package Activity;

public class Study extends Activity {

    public Study(String activity_name, String explanation) {
        super(activity_name, explanation);
    }

    @Override
    public void printActivityInformation() {
        System.out.println("Study : " + getActivityName() + " : " + getStatus() + "\n");
    }
}
