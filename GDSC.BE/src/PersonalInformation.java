public class PersonalInformation{
    // 필드 (속성)
    public final String name;
    public String department;
    public String major;
    public String field;
    public String gitId;
    public String interestedField;
    public String introduction;
    public String skill;

    // 생성자
    public PersonalInformation(String name, String department, String major, String field, String gitId, String interestedField, String introduction, String skill) {
        this.name = name;
        this.department = department;
        this.major = major;
        this.field = field;
        this.gitId = gitId;
        this.interestedField = interestedField;
        this.introduction = introduction;
        this.skill = skill;
    }

    // 인적 사항 출력
    public void printInfo() {
        System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Major: " + major);
        System.out.println("Field: " + field);
        System.out.println("Git ID: " + gitId);
        System.out.println("Interested Field: " + interestedField);
        System.out.println("Introduction: " + introduction);
        System.out.println("Skill: " + skill);
        System.out.println("Extra Information: " + extraInfo); // 제네릭 정보를 출력
    }

}