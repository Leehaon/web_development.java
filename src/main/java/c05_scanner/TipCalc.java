package c05_scanner;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            음식점에서 팁을 계산하는 것을 원화 기준으로 한다면?

            10, 12, 15 퍼센트 중 하나르 선택

            인원수르 입력 받아서, 더치페이르 할 수이 있도록 구성

            ex)
            100000원짜리 음식을 결제하고, 팁으로 10퍼센트를 준다면
            전체 음식값은 110000원이 된다.
            5명에서 나눈다면, 22000원이 결과값이 됨.

         */
        // 1. 음식 가격을 입력 받아야 함 -> 물어보고 / 입력 받는다 - > scanner

        // 2. 몇 % 퍼센트의 팁을 낼 건지 입력 받아야 함.

        // 3. 입력 받은 %에서 / 100을 연산 해야 함.

        // 4. 3의 결과값 * 1의 결과값을 하게 되면 팁의 가격이 선출됨.

        // 5. 1의 결과값 + 4의 결과값을 하면 전체 음식 가격이 선출됨.

        // 6. 인원수를 입력 받아야 함.

        // 7. 5의 결과값 / 6의 결과값 = 팁을 포함한 더치페이 가격이 산출됨.
//        int foodPrice;
//        int percent;
//        int totalPrice; // 팁과 음식 가격을 합친 데이터의 변수명
//        int people;     // 더치페이 할 인원수르 나타내는 변수명
//        int pricePenPerson; // 1인 당 지불해야하는 가격을 나타내는 변수명
//
//        System.out.print("음식의 가격은 얼마입니까? >>> ");
//        foodPrice = scanner.nextInt();
//        System.out.print("몇 %의 팁을 내기를 원하십니까,10, 12, 15% 중 하나를 선택하세요 >>> ");
//        percent = scanner.nextInt();
//        // totalPrice를 연산하세요.
//        totalPrice = foodPrice + percent * foodPrice / 100;
//        // percent / 100을 할 경우 0.1이 나오면 int가 아니라 double이기 때문에 연산 안됨
//        System.out.print("몇명에서 나누어 냅니까? >>> ");
//        people = scanner.nextInt();
//        pricePenPerson = totalPrice / people;
//        System.out.println("한 명이 지불해야하는 돈은 " + pricePenPerson + "입니다.");
//
        // 사용될 변수 선언

        int foodPrice;
        double percent;
        // 한개 추가 -> 선언해서 작성하는 이유는 percnt를 int로 고정시켰을 경우
        // 수식을 쓰는 방식이 제안됨
        double percentModified;
        double totalPrice;
        int peoples;
        double pricePerPerson;
        String logo = """
                d888888P oo           a88888b.          dP         \s
                   88                d8'   `88          88         \s
                   88    dP 88d888b. 88        .d8888b. 88 .d8888b.\s
                   88    88 88'  `88 88        88'  `88 88 88'  `""\s
                   88    88 88.  .88 Y8.   .88 88.  .88 88 88.  ...\s
                   dP    dP 88Y888P'  Y88888P' `88888P8 dP `88888P'\s
                            88                                     \s
                            dP                                     \s
                """;

        System.out.println(logo);
        System.out.print("음식의 가격은 얼마입니까? >>> ");
        foodPrice = scanner.nextInt();;
        System.out.print("몇 %의 팁을 내기를 원하십니까,10, 12, 15% 중 하나를 선택하세요 >>> ");
        percent = scanner.nextInt();
        // double로 percent를 변환
        percentModified = (double) percent / 100;
//        System.out.println("percentModified = " + percentModified);   -> test code
//        totalPrice = (foodPrice + (foodPrice * percentModified));
        totalPrice = foodPrice * (1 + (percentModified));
        // foodPrice가 동일한 요소이기 때문에 묶어줌
        System.out.print("몇명에서 나누어 냅니까? >>> ");
        peoples = scanner.nextInt();
        pricePerPerson = totalPrice / peoples;
        // 변수 선언을 해당 위치에서 한이유는 형변환을 위해서는 반드시 pricePerPerson에 초기화를 해야하기 때문
        int pricePenPersonInt = (int) pricePerPerson;
        System.out.println("한 명이 지불해야하는 돈은 " + pricePenPersonInt + "입니다.");
    }
}
