package c13_inheritance;

public class Animal {
    // 필드 선언
    String animalName;
    int animalAge;

    // 생성를 하나하나 정의하세요

    public Animal() {}

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(int animalAge, String animalName) {
        this.animalAge = animalAge;
        this.animalName = animalName;
    }

    // setter / getter 하나하나 정의하세요


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // 매서드 선언
    public void move() {
        System.out.println("움직입니다.");
    }
}
