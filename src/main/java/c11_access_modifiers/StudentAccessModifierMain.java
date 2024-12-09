package c11_access_modifiers;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
        // 객체 생성을 기본 생성자를 통해서 할 것
        StudentAccessModifier student1 = new StudentAccessModifier();

        // setter를 통해서 데이터 입력
        student1.setStudentCode(1332);
        student1.setStudentName("이하온");
        student1.setStudentAvg(100.0);

        // .showInfo() 메서드를 통해서 객체 정보 출력
        student1.showInfo();

        // 새로운 객체를 student2로 생성하는데, 생성 시에 이름을 "이하순"으로 만들어주세요.
        // 클래스명 객체명 = new 매개변수생성자("이하순")
        StudentAccessModifier student2 = new StudentAccessModifier("이하순");

        // setter를 사용하는 경우
        // 점수는 97.5, 학번은 13322로 입력하세요. -> 아직 없는 값에 데이터 대입
        student2.setStudentCode(13322);
        student2.setStudentAvg(97.5);
        // "이하순"을 "이하중"으로 고치세요.         -> 기존에 있는 값에 데이터 재 대입
        student2.setStudentName("이하중");

        // 고친 이름을 콘솔창에서 확인하기 위해 getter를 사용하세요 - > return으로 정의돼있어
        // 출력문을 명시해야 함.
        System.out.println(student2.getStudentName());

        // 이름이 "이하중"으로 고쳤다면, .showInfo()를 통해 정보를 톤솔에 출력하세요
        // showInfo()의 경우 메서드 내에 sout으로 처리했기 때문에 getter 정볼를 출력할 때와
        // 코드가 다릅니다. 주의하시기 바랍니다.
        student2.showInfo();

        // 다하신 분들은 새로운 패키지를 만들어주세요 c12_arrays -> class ArrayTest01로 만들어주세요
    }
}
