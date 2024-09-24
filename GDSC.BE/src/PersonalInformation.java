import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;


public class PersonalInformation<K, V> {
    // 필드 (속성)
    public final String name;
    public String department;
    public Optional<String> major = Optional.empty();
    public Map<K, V> additionalInfo;


    // 생성자
    public PersonalInformation(String name, String department, String major) {
        this.name = name;
        this.department = department;
        this.major = Optional.of(major);
        this.additionalInfo = new HashMap<>();

    }

    public PersonalInformation(String name, String department) {
        this.name = name;
        this.department = department;
        this.additionalInfo = new HashMap<>();
    }

    // 추가적인 정보를 추가할 수 있는 메서드
    public void addAdditionalInfo(K key, V value) {
        additionalInfo.put(key, value);
    }


    // 인적 사항 출력
    public void printInfo() {
        try {
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Major: " + major.orElseThrow(() -> new NoSuchElementException()));
        } catch (NoSuchElementException e) {
            System.out.println("Major: 미등록된 정보");
        }

        // 추가적인 정보 출력
        if (!additionalInfo.isEmpty()) {
            System.out.println("Additional Information:");
            for (Map.Entry<K, V> entry : additionalInfo.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}

