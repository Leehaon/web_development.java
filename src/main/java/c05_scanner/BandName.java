package c05_scanner;

import java.util.Scanner;

public class BandName {
    public static void main(String[] args) {

        // Scanner class를 import -> 콘솔창에 입력을 하기 위해
        Scanner scanner = new Scanner(System.in);

        // 변수 선언 -> 초기화 하지 않음
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.print("이름이 무엇입니까? >>> ");
//        name = scanner.nextLine();
//        System.out.print("몇 살입니까? >>> ");
//        age = scanner.nextLine();
//        System.out.print("학교가 어디입니까? >>> ");
//        school = scanner.nextLine();
//        System.out.print("MBTI가 무엇입니까? >>> ");
//        mbti = scanner.nextLine();
//
//        System.out.print("제 이름은 " + name + "이고, ");
//        System.out.println("나이는 " + age + "살 입니다.");
//        System.out.println(school + "에 재학 중이며, MBTI는 " + mbti + "입니다.");
//        제 이름은 이하온이고, 나이는 14살 입니다.
//        부산수영중학교에 재학 중이며, MBTI는 ENTP입니다.

        // pantsColor, lastFood 변수를 선언 -> String

        // 입력 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지금 입은 하의 색깔이 무엇인가요? >>>
        // 마지막으로 먹은 음식이 무엇인가요? >>>

        // pantsColor에 lastFood를 이용하여 밴드 네임을 출력하세요.
        // 당신의 밴드 이름은 그레이 시리얼입니다.

        // 1. 선언과 초기화를 따로 할 때
        String logo = """
                 888888ba                          dP\s
                 88    `8b                         88\s
                a88aaaa8P' .d8888b. 88d888b. .d888b88\s
                 88   `8b. 88'  `88 88'  `88 88'  `88\s
                 88    .88 88.  .88 88    88 88.  .88\s
                 88888888P `88888P8 dP    dP `88888P8\s
                                                     \s
                                                     \s
                """;


        String pantsColor;
        String lastFood;

        System.out.print("지금 입은 하의 색깔이 무엇인가요? >>> ");
        pantsColor = scanner.nextLine();
        System.out.print("마지막으로 먹은 음식이 무엇인가요? >>> ");
        lastFood = scanner.nextLine();
        System.out.println("당신의 밴드 이름은 " + pantsColor + " " +lastFood + "입니다.");

//         2. 선언과 초기화를 같이 할 때
//         pantsColor2와 lastFood2는 1을 주석하지 않았을 때 실행시키고 쉽게 보기위함.
        System.out.print("지금 입은 하의 색깔이 무엇인가요? >>> ");
        String pantsColor2 = scanner.nextLine();
        System.out.print("마지막으로 먹은 음식이 무엇인가요? >>> ");
        String lastFood2 = scanner.nextLine();
        System.out.println("당신의 밴드 이름은 " + pantsColor2 + " " +lastFood2 + "입니다.");

    }
}
