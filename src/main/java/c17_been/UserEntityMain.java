package c17_been;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();


        /*
            username에 haon
            password *****
            email에 global@naver.com
            name 이하온을 넣은 다음에

            콘솔에 출력해보세요.
         */

        user1.setUsername("haon");
        user1.setPassword("*****");
        user1.setEmail("global3556@naver.com");
        user1.setName("이하온");

        // 이하의 코드에서 알 수 있는 것 : @Data 에너테이션 내부에는 toString() 메서드가 구현돼 있음
        System.out.println(user1);
    }
}
