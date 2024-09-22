
public class Main {
    public static void main(String[] args) {
        // Person 객체 생성
        Person student = new Person("Jowonjun", 202403511, 20, "jowonjun@example.com", "010-1234-5678", "jwjbb", "network");

        // // 인적 사항 출력
        // student.printPersonInfo();

        // // 이메일 및 전화번호 변경
        // student.setPhoneNumber("010-8765-4321");

        // //흥미 분야 변경 
        // student.setinterestedField("backend");

        // // 변경된 인적 사항 출력
        // System.out.println("\n업데이트 됨!");
        // student.printPersonInfo();

        student.printAllPersons();
    }
}