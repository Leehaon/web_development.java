package c19_generic.wildcards.wildcard_practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T>{
    private T animal;           // Main.java에 비교했을 때 결과적으로 <? extends Animal>의 적용된다면
                                // animal에 들어갈 수 있는 Human 혹은 Tiger 클래스의 인스턴스밖에 없겠죠.

    public void printData() {
        ((Animal) animal).move();   // T이기 때문에 Object 클래스의 객체가 들어올 수
                                    // 있는데 명시적 다운캐스팅을 통해서 Animal클래스
                                    // 의 인스턴스로 animal의 바뀜. -> .move()사용 가능
        if (animal.getClass() == Human.class) { // AnimalData의 필드(animal)는 이상의 코드로 인해 Animal클래스이 객체
            ((Human) animal).readBooks();       // 근데 그 animal이 Human 클래스의 인스턴스이기도 한다면 readBooks() 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger) animal).hunt();            // animal을 Tiger 클래스로 명시적인 다운캐스팅(Animal -> Tiger)하여 .hunt()호출
        }


    }

    // Car.java로 넘어가세요.
}
