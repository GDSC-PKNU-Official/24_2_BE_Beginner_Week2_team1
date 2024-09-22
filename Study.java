public class Study extends Activity {
    enum Status {
        Ongoing,
        Completed
    }

    private Status study_status;

    public Study(String activity_name, String explanation) {
        super(activity_name, explanation);
    }

    public void setStatus(Status status) {
        this.study_status = status;
        System.out.println(getActivity_name() + "의 상태가 " + status + "로 설정되었습니다.");
    }

    public Status getStatus() {
        return study_status;
    }
}
