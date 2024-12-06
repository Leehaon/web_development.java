package c09_classes;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();       -> 이제는 new 클래스명();에서 "클래스명():이 생성자라는 사실을 우리는 압니다.
        // 1번 지시사항 - 기본 생성자 사용
        Product product1 = new Product();
        // 기본 생성자를 사용했다는 말을 객체 생성 시 속성에 아무런 값ㅇ르 대입하지 않았다는 의미이므로
        // 추가적인 코드 작성을 통해 속성에 값을 대입해야만 함
        // 예시를 위한 product1.showInfo() 메서드 확인
//        product1.showInfo();
        product1.productNum = 147256;
        product1.productName = "LG아이패드";
        // 필드에 값 삽입 후 product.showInfo()
//        product1.showInfo();
        // 2번 지시사항 - 시리얼 넘버 매개변수 생성자 사용
        Product product2 = new Product(987654);
        product2.productName = "DS충전기";
//        product2.showInfo();
        // 3번 지시사항 - 제품명 매개변수 생성자 사용
        Product product3 = new Product("피치패드");
        product3.productNum = 158057;
//        product3.showInfo();
        // 4번 지시사항 - 시리얼 넘버 및 제품명 매개변수 -> 생성자 사용
        Product product4 = new Product(4862, "블루미플립6");
//        product4.showInfo();



    }
}
