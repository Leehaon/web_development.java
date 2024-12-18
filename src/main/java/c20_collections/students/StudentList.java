package c20_collections.students;

import java.util.ArrayList;
import java.util.List;

/*
    students 패키지 생성
    Student.java
    StudentList.java 클래스 생성
 */
public class StudentList {
    public static void main(String[] args) {

        // 비어있는 List 선언
        List<Student> students = new ArrayList<>();

        // 1332 이하온
        // 1333 이하순
        // 1334 이하중
        // 1335 이하남
        // 1336 이하북
        // 을 추가하세요.

        // 추가후에 전체 리스트를 출력하세요.

        Student student1 = new Student(1332, "이하온");
        students.add(student1);

        students.add(new Student(1332, "이하온"));

        System.out.println(student1);
        System.out.println(students.get(0));
        students.get(0).setName("이하온");
        System.out.println(students.get(0).getName());
    }
}
