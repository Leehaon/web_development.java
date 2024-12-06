package c07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        /*
            별찍기

            *
            **
            ***
            ****
            *****
         */
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
            i = 0

            i = 1
            *
            i = 2
            **
            i = 3
            ***
            i = 4
            ****
            i = 5
            *****
         */
        // 한 번 개행이 일어나면 하지만 별 다섯개로 마무리되는 코드
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            숫자를 입력하세요 >>> 3
            *
            **
            ***
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int raw = scanner.nextInt();
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < i + 1; j++) {
                //실행문 2 -> 별이 찍히는 개수를 통제
                System.out.print("*");
            }
            // 실행문 3 -> 개행이 일어나는 것.
            System.out.println();
        }





    }
}
