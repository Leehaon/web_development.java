package c04_operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // 콘솔창에 사람이 입력값을 넣을 수 있음
        System.out.print("년도를 입력하세요 >>> ");
//        int year = scanner.nextInt();   // 콘솔창에 int값을 입력하면 그 데이터가 year 변수에 저장됨.
//        System.out.println("올해 년도는 " + year + "년입니다.");

        String year1 = scanner.nextLine();
        System.out.println("올해 년도는 " + year1 + "년입니다.");

//        boolean year2 = scanner.nextBoolean();
//        -> scanner을 사용할 때 데이터를 저장할 변수의 자료형이 '매주 중요'합니다.


        System.out.print("이름을 입력하세요 >>>");
        String name = scanner.nextLine();
        System.out.println("나이를 입력하세요 >>>");
        int age = scanner.nextInt();
        System.out.print("당싱의 이름은 " + name + "이고, 나이는 ");
        System.out.print(age);
        System.out.print("살입니다. 내년에는 ");
        System.out.print(age + 1);
        System.out.print("살이 됩니다.");
    }
}
