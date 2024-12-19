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

//        Student student1 = new Student(1332, "이하온");
//        students.add(student1);

        students.add(new Student(1332, "이하온"));
        students.add(new Student(1333, "이하순"));
        students.add(new Student(1334, "이하중"));
        students.add(new Student(1335, "이하남"));
        students.add(new Student(1336, "이하북"));

        //        System.out.println(student1);
//        System.out.println(students.get(0));
//        students.get(0).setName("이하온");
//        System.out.println(students.get(0).getName());

        // 추가후에 전체 리스트를 출력하세요.

//        System.out.println("전체 리스트 : " + students);
//
//        // 0번째 부터 5번째까지 집어 넣었기 때문에 인덱스 넘버 4에 위치한 요소의 학번
//
//        System.out.println("4번째에 위치한 학생의 이름 : " + students.get(4).getId());
//
//        // 2번째 위치한 요소의 이름을 콘솔에 출력하세요.
//
//        System.out.println("2번째에 위치한 학생의 이름 : " + students.get(2).getName());
//
//        // "이하중" 이름을 가진 객체의 학번을 콘솔에 출력하시오. -> 검색과 관련있습니다. StringList.java 확인해서 만들기
//
//        String searchStr = "이하중";
//        // 일반 for 문
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getName().equals(searchStr)) {  // 문자열을 비교하는 것이기 때문에 ==이 아니라 .equals()를 사용함.
//                System.out.println(searchStr + " 학생의 학번 : " + students.get(i).getId());
//            }
//        }
//
//        // 향상된 for 문
//        for (Student student : students) {
//            if (student.getName().equals(searchStr)) {
//                System.out.println(student.getName() + " 학생의 학번 : " + student.getId());
//            }
//        }
//
//
//        // 1336 학번을 가진 객체의 이름을 콘솔에 출력하시오. -> 마찬가지로 검색과 관련이 있습니다.
//
//        int searchInt = 1336;
//        // 일반 for 문
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == searchInt) {  // 문자열을 비교하는 것이기 때문에 ==이 아니라 .equals()를 사용함.
//                System.out.println(searchInt + " 학번을 지닌 학생의 이름 : " + students.get(i).getName());
//            }
//        }
//
//        // 향상된 for 문
//        for (Student student : students) {
//            if (student.getId() == searchInt) {
//                System.out.println(student.getId() + " 학번을 지닌 학생의 이름 : " + student.getName());
//            }
//        }

        // setName() 메서드를 활용합니다.
        // Id = 1332인 학생을 찾고, 그 이름이 이하온이라면, 이하하로 바꿀 것

        for (Student student : students) {
            if (student.getId() == 1332) {
                if (student.getName().equals("이하온")) {
                    student.setName("이하하");
                    System.out.println(student.getId() + " 학번의 학생의 이름이 " + students.get(0).getName() + "(으)로 바뀌었습니다.");
                    break;
                }
            }
        }

        // list의 요소 삭제 방법
        System.out.println("삭제 전 전체 리스트 : " + students);

        // list에는 인덱스 넘버가 있기 때문에 인덱스 번호로 삭제 가능
        // 인덱스 넘버 이외에도 특정한 문자열을 가지고 있으면 삭제가 가능합니다. -> StringList.java 확인
        students.remove(0);
        System.out.println("삭제 후 전체 리스트 : " + students);

        // 이름이 이하중인 학생 객체를 리스트에서 삭제하는 코드를 작성하시오.

        // 인덱스 넘버로 삭제해야하기 때문에 향상된 for문의 사용이 불가능했습니다.
//        for (Student student : students) {
//            if (student.getName().equals("이하중")) {
//                students.remove();
//                System.out.println("삭제 후 전체 리스트 : " + students);
//
//            }
//        }

//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getName().equals("이하중")) {
//                students.remove(i);
//                break;
//            }
//        }
//        System.out.println("삭제 후 리스트 : " + students);

        // .remove(Object o)를 이용한 방법 -> 이 경우는 향상된 for문도 가능합니다.
        for (Student student : students) {
            if (student.getName().equals("이하북")) {
                students.remove(student);
                break;
            }
        }
        System.out.println("삭제 후 리스트 : " + students);
    }
}
