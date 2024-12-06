package c01_print;
/*
    Main.java -> java 프로그램 실행 배열이 됨을 의미함.
 */
public class Main {
    /*
     다중 주석을 위한 명령어
     */

    //무언가 작업을 한 후에 주석 처리를 하고 싶을 경우 -> 맨 앞에 슬러시 두개
//    ctrl + / 는 자동 주석
    public static void main(String[] args) {
        System.out.println("hello, java!");
        /*
            주석 : 컴퓨터가 해당 부분을 컴파일링 하지 않고, 사람이 읽을 수 있도록 하는 영역
         */
        /**
         * 클래스 또는 래서드의 역할을 명시, 또는 설정하기 위한 주석
         */
        // 문자열(String)을 출력하기 위한 방법 -> 해당 문자열을 큰따움표(")를 감싼다.
        // 문자열의 의미 -> 각 문자열의 합 -> 순서가 있음
        System.out.println(123);
        System.out.println("123");
        System.out.println(123 + 4);
        System.out.println("123" + "4");

    }
}
