public class PersonalInformation {
    // 필드 (속성)
    public final String name;
    public String department;
    public String major;
    public String gitId;
    public String interestedField;
    public String introduction;

    // 생성자
    public PersonalInformation(String name, String department, String major, String gitId, String interestedField, String introduction) {
        this.name = name;
        this.department = department;
        this.major = major;
        this.gitId = gitId;
        this.interestedField = interestedField;
        this.introduction = introduction;
    }

    // 인적 사항 출력
    public void printInfo() {
        System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Major: " + major);
        System.out.println("Git ID: " + gitId);
        System.out.println("Interested Field: " + interestedField);
        System.out.println("Introduction: " + introduction);
    }

}
