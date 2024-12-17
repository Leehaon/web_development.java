package c18_static.builders;
/*
    1. 빌더 패턴(Builder Pattern)이란?
        빌더 패턴은 객체의 생성 과정에서 "복잡한 생성자"를 대신하여 객체를 단계적으로 생성할 수 있도록
        도와주는 디자인 패턴 GOF(Gang of Four) 대자인 패턴 중 하나로, 객체 생성 시 가독성과 유연성ㅇ르
        제공하는 것이 목표.

        주요 특징 :
            1) 객체를 생성하는 여러 개의 필드를 명시적으로 관리할 수 있음.
            2) 불필요한 생성자 오버로딩을 줄여 가동성을 높임
            3) 체어닝 메서드를 사용하여 객체를 직관적으로 생성

    2. 빌더 패턴이 생기게 된 원인
        1. 복잡한 생성자 문제
            객체의 필드가 많아질 수록 생성자의 파라미터 수도 늘어남.
            - Person.java 주석 확인
        2. 생성자 오버로딩 문제 - 생성자에 필요한 조합이 다를 경우 수많은 생성자를 만들어야 함.
            -> 유지 보수에 역영함
        3. 가독성과 유지보수
            코드를 작성하고 읽는 입장에서 객체를 생성할 때 어떤 값이 어떤 필드에 해당하는지
            명확하지 않아 실수르 유발할 수 있음.

        -> 이상을 이유로 빌더 패턴의 개념이 생겨났습니다. -> Person.java에 작성할 예정
 */
public class PersonMain {
    public static void main(String[] args) {
        // Person.java에서 정의한 Builder Pattern을 이용하여 객체를 생성하는 방법
        Person person1 = new Person.Builder("이하온")  // private final String name으로 정의한거 기억하세요
                .build();
        Person person2 = new Person.Builder("이하순")
                .age(13)
                        .build();

        Person person3 = new Person.Builder("이하중")
                .address("부산광역시 수영구")
                        .build();

        Person person4 = new Person.Builder("이하남")
                .age(15)
                        .address("부산광역시 해운대구")
                                .build();

        Person person5 = new Person.Builder("이하북")
                .address("부산광역시 강서구")
                        .age(14)
                                .build();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        // 기존 생성 방법의 경우
//        Person person = new Person("이하온"); -> 생성자를 private으로 했기 때문에 불가능합니다.
//        Person Person2 = new Person("이하순");
//        person2.setAge(14);
//
//        Person Person3 = new Person("이하중");
//        person2.setAdress("부산광역시 해운대구");


    }
}
