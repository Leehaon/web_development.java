package c05_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // import 명령어 가장 위에
        Scanner scanner = new Scanner(System.in);
        // 사용되는 변수 그 다음에
        int year;

        System.out.print("윤년인지 확인하고자 하는 년도를 입력하세요 >>> ");
        year = scanner.nextInt();
        /*
            year에 특정한 년도를 엏었을 때,
            해당 년도가 윤년이면 true, 아니라면 false를 출력하는 프로그램을 작성하시오.

            조건
            해당 year에 4의 배수이면 윤년,
            하지만 100의 배수이면 윤년이 아님,
            근데 또 400의 배수이면 윤년에 해당함

            Operator2.java 읽어보고 어떻게 쓸지 고민해보세요.
         */
        boolean result = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + "년은 윤년입니까? : " + result);

    }
}
