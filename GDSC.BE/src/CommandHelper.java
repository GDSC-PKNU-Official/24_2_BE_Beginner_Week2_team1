import Activity.Project;
import Activity.Study;
import Events.Date;
import Events.Events;
import Membership.Beginner;
import Membership.Coremember;
import Membership.Member;
import Membership.Senior;

import java.util.ArrayList;

public class CommandHelper {

    private final ArrayList<Person> people = new ArrayList<>();
    private final ArrayList<Project> projects = new ArrayList<>();
    private final ArrayList<Study> studies = new ArrayList<>();
    private final ArrayList<Events> events = new ArrayList<>();

    public CommandHelper() {
        addPeople();
        addProjects();
        addStudies();
        addEvents();
    }

    private void addEvents() {
        Events e1 = new Events(new Date(2024, 9, 12, 18, 0), "깃세션", "공간숲");
        events.add(e1);
        Events e2 = new Events(new Date(2024, 10, 28, 20, 30), "정기모임", "장보고관");
        events.add(e2);
    }

    private void addStudies() {
        Study s1 = new Study("백엔드 스터디", "스프링을 공부합니다.");
        studies.add(s1);
        Study s2 = new Study("프론트엔드 스터디", "리액트를 공부합니다.");
        studies.add(s2);
    }

    private void addProjects() {
        Project p1 = new Project("백엔드 프로젝트", "백엔드 프로젝트 설명", "2024-12-19");
        projects.add(p1);
        Project p2 = new Project("프론트엔드 프로젝트", "프론트엔드 프로젝트 설명", "2024-11-24");
        projects.add(p2);
    }

    private void addPeople() {
        Person p1 = new Person(new PersonalInformation("김서영", "컴퓨터인공지능공학부", "컴퓨터공학전공"), new Coremember("임베디드", "커뮤니티 매니징"));
        people.add(p1);
        Person p2 = new Person(new PersonalInformation("조원준", "전자정보통신공학부"), new Beginner("백엔드", "백엔드"));
        people.add(p2);
        Person p3 = new Person(new PersonalInformation("김규남", "컴퓨터인공지능공학부", "컴퓨터공학전공"), new Member("백엔드"));
        people.add(p3);
        Person p4 = new Person(new PersonalInformation("이효진", "컴퓨터인공지능공학부", "컴퓨터공학전공"), new Senior("백엔드"));
        people.add(p4);
    }

    public void printPeopleList() {
        System.out.println("<소속된 회원 목록>");
        for (Person person : people) {
            System.out.println("\n");
            person.printPersonInfo();
            System.out.println("----------");
        }
    }

    public void printStudiesList() {
        System.out.println("<개설된 스터디 목록>");
        for (Study study : studies) {
            study.printStudy();
        }
    }

    public void printProjectsList() {
        System.out.println("<개설된 프로젝트 목록>");
        for (Project project : projects) {
            project.printProject();
        }
    }

    public void printEventsList() {
        System.out.println("<모든 이벤트 목록>");
        for (Events event : events) {
            event.printEvents();
        }
    }

    public void printCommunityInformation() {
        System.out.println("소속 인원: " + people.size() + "명");
        System.out.println("계획된 행사: " + events.size() + "개");
    }

}