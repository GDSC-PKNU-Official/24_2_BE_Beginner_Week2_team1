public class Project extends Activity {
    enum Status {
        Ongoing,
        Completed
    }

    private Status project_status;
    private String deadline;

    public Project(String activity_name, String explanation, String deadline) {
        super(activity_name, explanation);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setStatus(Status status) {
        this.project_status = status;
        System.out.println(getActivity_name() + "의 상태가 " + status + "로 설정되었습니다.");
    }

    public Status getStatus() {
        return project_status;
    }


}
