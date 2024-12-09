package c13_inheritance;
/*
    Tiger.jave처럼
    생성자 및 setter / getter을 작성하시고 -> 상속 받은 상대에서 작성하셔야 합니다.
    Animal 클래스가 move 메서드를 override 받아서 "두발로 걷습니다."을 출력할 수 있도록 "재정의" 하시고
    Main.java에서

    Animal 객체를 생성하고 setter를 이용, 여러분의 이름과 나이를 입력하시고,
    Human.move() 메서드를 실행시키세요.

    실행 예
    움직입니다.
    두 발로 걷습니다.
 */
public class Human extends Animal{
    // 생성자 선언
    public Human() {
        super();
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(int animalAge, String animalName) {
        super(animalAge, animalName);
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
        super.move();

        System.out.println("두 발로 걷습니다.");
    }


}
