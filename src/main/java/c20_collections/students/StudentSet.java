package c20_collections.students;

import javax.xml.stream.events.StartDocument;
import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        // students 라는 Set을 만드세요.
        Set<Student> students = new HashSet<>();

        // Set 내부에 데이터를 입력하세요.
        students.add(new Student(1332, "이하온"));
        students.add(new Student(1333, "이하순"));
        students.add(new Student(1334, "이하중"));
        students.add(new Student(1335, "이하남"));
        students.add(new Student(1336, "이하북"));
        students.add(new Student(1337, "이하동"));

        /*
            1332    이하온
            1333    이하순
            1334    이하중
            1335    이하남
            1336    이하북
            1337    이하동
         */

        // 전체 Set을 출력하세요.
        System.out.println(students);

        // 정렬을 하기 위해 List를 선언하세요. -> studentList
        List<Student> studentList = new ArrayList<>();

        // 비어있는 List에 Set의 값들을 전부 대입하세요.
        studentList.addAll(students);

//         List에서 오름차순으로 정렬하세요. -> 하지 마세요!!!!
//        Collections.sort(studentList);
//
//         정렬된 List를 출력하세요. -> 하지 마세요!!!!
//        System.out.println(studentList);

        // 1335 학번을 지닌 학생의 객체를 Set에서 삭제하세요.
        students.remove(1335);

        // 1333 학번을 지닌 학생의 이름을 이하서 로 바꾸세요.


        // 1332 학번을 지닌 학생의 이름을 출력하세요.
        for (Student student : students) {
            if (student.getId() == 1332) {
                System.out.println(student.getId() + " 학번을 지닌 학생의 이름 : " + student.getName());
            }
        }

        // 이하동의 학번을 출력하세요.
        for (Student student : students) {
            if (student.getName().equals("이하동")) {
                System.out.println("이하동 학생의 학번 : " + student.getId());
            }
        }

        //List에서 오름차순으로 정렬하세요.
//        Collections.sort();   -> 시도를 해봤으나 자료형이 String이 아니라 Students라서 실패

        //정렬된 List를 출력하세요.


        // 이상의 코드에서 Student(id=20250002, name=이진혁)가 중복으로 나왔던 점을 알 수 있습니다.
        // 이것은 참조자료형이기 때문에 생겨날 수 있는 문제로 테스트 전까지 확인을 할 수 없는 부분이기도 합니다.

        // 그렇다면 중복이 보기 싫으면 어떡하면 될까요?
        // 비어있는 Set 하나 다시 선언해서 거기다가 studentList의 데이터를 다 넣으면 됩니다, 예를 들어
        // students2.addAll(studentList) 형태로 하면 중복 없이 데이터가 저장될 겁니다.

        // 혹은 students.clear()를 이용하여 비워내는 방법이 있습니다.

        students.clear();
        students.addAll(studentList);
        System.out.println("재대입 set : " + students);

        // 정열이 적용된 list를 하나 선언하겠습니다.
        // 순서를 정렬할 int 하나 선언하겠습니다.
        int orderId = 1331;
        List<Student> sortedStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++){      // size는 set의 사이즈대로 반복
            orderId++;
            for (Student student : students) {
                if (student.getId() == orderId) {   // 객체의 필드인 id가 1332부터 해서 오름차순으로
                    sortedStudents.add(student);    // 해당 실행문이 실행됬다면 위의 조건문이 true
                }                                   // 하기 때문에 순서대로 list에 저장될 예정입니다.
            }
        }
        System.out.println("정렬된 list : " + sortedStudents);

        // 기존의 정렬되지 않은, 그리고 중복이 남아있는 list와 set에 정렬된 것들만 남기고 싶다면
        // .deleted()을 사용해서 다 비워내고, 다시 재 대입하시면 됩니다.

        // 지우는 반복문 작성
//        for (Student student : studentList) {
//            studentList.remove(student);
//        }
        for (int i = 0; i < studentList.size(); i++) {
            studentList.remove(i);
        }
        System.out.println(sortedStudents);
    }
}

//}