package c12_arrays;
/*
    String[] names 배열을 선언하고
    출석부의 이름을 입력하도록 하여 names 배열에 집여넣는 프로래램을 작성합니다.

    실행 예
    몇 명의 학생을 등록하시겠습까? >>> 15
    21 번 학생 이름 : 고강윤
    22 번 학생 이름 : 고희준
    23 번 학생 이름 : 김강모
    24 번 학생 이름 : 김시현
    25 번 학생 이름 : 김윤식
    27 번 학생 이름 : 심규대
    28 번 학생 이름 : 안지훈
    29 번 학생 이름 : 유현민
    30 번 학생 이름 : 이성음
    31 번 학생 이름 : 이승후
    32 번 학생 이름 : 이하온
    33 번 학생 이름 : 정유빈
    34 번 학생 이름 : 조정호
    35 번 학생 이름 : 한규철
    36 번 학생 이름 : 정한결

    -> count에 선언된 수 만큼 학생 이름을 입력할 수 있도록 반복문을 작성해야 함.

 */

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇 개짜리 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;

        // 배열의 크기를 결정 짓기 위해서
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        count = scanner.nextInt();
        // 위에서 .nextInt()를 사용했고, 밑에 학생 이름을 입력 받을 예정이기 때문에
        scanner.nextLine(); // 배리어를 미리 작성

        // String 배열 선언 초기화
        String[] names = new String[count];

        // 학생의 이름을 count 횟수만큼 입력 받기 위한 반복문 작성
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번 학생 이름 : ");
            names[i] = scanner.nextLine();
        }

        // 학생의 이름을 출력하기 위한 반복문 작성
        // count만큼 입력 받았기 때문에 count = names.length
//        for (int i = 0; i < count; i++) {
//            System.out.println((i + 1) + ". " + names[i]);
//        }

        System.out.println(" [ 출력 결과 ] ");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}
