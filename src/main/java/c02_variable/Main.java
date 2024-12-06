package c02_variable;

public class Main {
    public static void main(String[] args) {
        /*
            변수(variable) : 데이터를 담을 수 있는 바구니
         */
        // 1. 논리 자료형:boolean 변수    : 참 / 거짓
        boolean checkFlag = false; // or true
//        자료형 변수명 = 데이터;        변수, 선언 및  초기화 방법
        System.out.println(checkFlag);
        // java에서의 변수 표기법 -> 카멜 표기법 : 첫문자는 소문자로 -> 복수의 단어가 결합되는 경우,
        // 두번째 단어의 첫번째 문자는 대문자로 표기함
        // ex) 하나 짜리 단어인 경우
        // String example;
        // ex) 복수의 단어를 조합된 겨우
        // String exampleOfKorean
        checkFlag = true;       // 변수에 데이터 재대입
        System.out.println(checkFlag);
//        checkFlag2 = true;    // 변수가 발생함을 확인
        boolean checkFlag3;     // 변수 선언 -> 자료형 변수명;
        checkFlag3 = true;      // 변수에 값을 최초로 대입하는 것을ㄹ -> 초기화
        // 최초로 변수를 선언할 때 자료형(data type)을 명시하고 값으 대입하여 초기화함.
        // 추후 해당 변수에 값을 재대입 하는 경우에는 변수명 = (바뀐)값; 형태로 작성

        // 2. 문자 자료형 변수
//        char name1 = '홍';       // 문자를 입력할 때는 작은 따움표(')로 감싼다.
//        char name2 = '길';       // 문자(character) : 알파벳 / 한글 / 숫자 하나
//        char name3 = '동';
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(name1 + name2 + name3); // 복수의 문자들이 표기된 주소가 출력됨
//        System.out.println("" + name1 + name2 + name3); // java의 sout의 경우 맨 앞의 자료형을 따라감
        // 즉, 큰따움표로 시작했을 겨우 () 내에 있는 전체 자료형을 문자열로 보기 때문에 "홍길동" 전체가 출력됨

        /*
            name1, 2, 3에 여러분의 이름을 한 글자씩 재대입하고,
            sout을 통해서 콘솔함에 이름이 출력될 수 있도록 작성하세요.
         */
        // 1. name1, 2, 3에 수강생들을 이름을 한 글자씩 제 대입하는 과정 : 제대입시 자료형 명시 하지 않음
        // 변수명 = (바뀐)값;
//        name1 = '이';
//        name2 = '하';
//        name3 = '온';
        // 2. 문자들을 합쳐서 문자열로 출력하는 방법
//        System.out.println("" + name1 + name2 + name3);

        // 3. 정수 자료형 변수
//        int victh1 = 100;
//        int victh2 = 200;
//        System.out.println(victh1);
//        System.out.println(victh2);
//        System.out.println(victh1 + victh2);    // 숫자끼리는 연산이 가능 -> c01에서 수업함.
//
//        String victh3 = "300";
//        String victh4 = "400";
//        System.out.println(victh3 + victh4);    // 문자끼리는 연산이 안되고, 나열만 가능 -> c01
//        System.out.println(victh1 + victh3);    // 정수 + 문자열 = 문자열로 나열 100300
//        System.out.println(victh4 + victh2);    // 문자열 + 정수 = 문자열로 나열 400200

        // java17 버전 이후 : 여러줄에 걸친 데이터를 하나의 변수에 대입 가능 큰따움표 세개를 사용한다
//        String introduction = """
//                이하온
//                이하온2
//                이하온3
//                홍길동
//                """;
//
//        System.out.println(introduction);
//        String introduction2 = """
//                이하온
//                14살
//                중학생
//                ENTP
//                """;
//        System.out.println(introduction2);
        //3.2.
//        int longNumber = 123456789123456789;  -> 오류 발생 : int가 포현할 수있는 자릿수를 벗어나서
//        System.out.println(longNumber);
        long time = System.currentTimeMillis();
        System.out.println(time);

        /*
        int (4비트, 8비트)
            최소값 : -2억
            최대값 : +2억
        long (8비트, 64비트)
            최소값 : -2... 아무튼 디빵 작은 수
            최대값 : +2... 아무튼 디빵 큰수
         */

        // 4. 실수 자료형의 변수
//        double pi = 3.141592;
//        System.out.println(pi);
//
////        int pi2 = 3.14;
//        double opZero = 3;
//        System.out.println(opZero);

        // 5. 상수
        // final 자료형 변수명 = 데이터
        final String FILE_PATH = "c:/lho_java";
        // 상수의 경우 변수명을 대문자로 작성
        final String lowerCaseVariable = "소문자의 변수명";    // 오류가 나지 않음 -> 1) 참조
        System.out.println(lowerCaseVariable);
        final String EXAMPLE_DF_FINAL;                      // 상수의 선언
        EXAMPLE_DF_FINAL = "이것이 예시입니다";               // 상수의 초기화 -> 2) 참조
        System.out.println(EXAMPLE_DF_FINAL);
//        EXAMPLE_DF_FINAL = "이것이 예시입니다";
        /*
            상수의 특징
            1) 개발자들끼리 약속으로 상수는 전체 대문자로 작성, 단어사이들 '_'로 표시
            2) 한 번의 선언 및 초기화가 가능
            3) 2)를 이유로, 재대입 불가능
         */





    }
}
