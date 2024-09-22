
class PersonInformation{
    // 필드 (속성)
    public final String name;
    private int studentId;
    private int age;
    private String email;
    private String phoneNumber;
    public String gitId;
    public String interestedField;

    // 생성자
    public PersonInformation(String name, int studentId, int age, String email, String phoneNumber, String gitId, String interestedField) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gitId = gitId;
        this.interestedField = interestedField;
    }


    // 이메일 설정
    public void setEmail(String email) {
        this.email = email;
    }

    // 전화번호 설정
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // git ID 설정
    public void setgitId(String gitId) {
        this.gitId = gitId;
    }

    // 흥미 분야 설정
    public void setinterestedField(String interestedField) {
        this.interestedField = interestedField;
    }


    // 인적 사항 출력
    public void printPersonInfo() {
        System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Git ID: " + gitId);
        System.out.println("interestedField: " + interestedField);
    }

}


