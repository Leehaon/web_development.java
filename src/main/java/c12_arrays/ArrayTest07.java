package c12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 하는 프롤그램을 작성할 예정입니다.

    1. 45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 겁니다.
    로또 번호 A -> index가 6개인 배열 : 게임 한 번
            5개 만들어져야 함. -> 총 5000원치

            중복 제거와 관련된 부분이 걸리 수 있다 -> Getter / Setter 부분 확인

            실행 예

            여기부분에 로또 로고 출력해주세요.

            로또 번호 추첨기에 오신 것을 환영 합니다. 5게임을 시작합니다. -> 5는 String이 아닐 것
            이번 로또 당첨 번호는 다음과 같습니다.
            [ 아무 번호 ]
            [ 아무 번호 ]
            [ 아무 번호 ]
            [ 아무 번호 ]
            [ 아무 번호 ]

 */
public class ArrayTest07 {
    public static void main(String[] args) {
        // 필요한 객체 생성
        // random.nextInt() 의 의미 : 0부터 a-1까지의 int를 입의적으로 생성함.
        Random random = new Random();

        // 필요한 변수 선언
        int[] lottoNumbers = new int[6];
        int number;
        int count = 5;
        boolean duplicate = false;  // duplicate : 중복이라는 의미 // false일 경우에만
                                    // lottoNumbers 배열에 element를 추가하면 되겠죠

        System.out.println(" /$$             /$$     /$$              \n" +
                "| $$            | $$    | $$              \n" +
                "| $$  /$$$$$$  /$$$$$$ /$$$$$$    /$$$$$$ \n" +
                "| $$ /$$__  $$|_  $$_/|_  $$_/   /$$__  $$\n" +
                "| $$| $$  \\ $$  | $$    | $$    | $$  \\ $$\n" +
                "| $$| $$  | $$  | $$ /$$| $$ /$$| $$  | $$\n" +
                "| $$|  $$$$$$/  |  $$$$/|  $$$$/|  $$$$$$/\n" +
                "|__/ \\______/    \\___/   \\___/   \\______/ \n" +
                "                                          \n" +
                "                                          \n" +
                "                           ");
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");



        lottoNumbers[0] = random.nextInt(45) + 1;
        number = random.nextInt(45) + 1;
        if (lottoNumbers[0] == number) {
            // 같으면 한 번더 random.nextInt()가 있어야겠죠
            number = random.nextInt();
            lottoNumbers[1] = number;
        } else {
            lottoNumbers[1] = number; // 대입 전에 lottoNumbers[0]의 중복 체크를 한 후에 다르다면 대입
        }

        lottoNumbers[2] = random.nextInt(45) + 1;
        lottoNumbers[3] = random.nextInt(45) + 1;
        lottoNumbers[4] = random.nextInt(45) + 1;
        lottoNumbers[5] = random.nextInt(45) + 1;

        // 오름 차순을 위한 코드
        Arrays.sort(lottoNumbers);
        // 대열 자체 출력을 하는 코드
        System.out.println(Arrays.toString(lottoNumbers));
    }

}