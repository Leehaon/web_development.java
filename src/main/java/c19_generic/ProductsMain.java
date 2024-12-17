package c19_generic;
/*
    1. products 클래스를 정의하고, 제네릭 대입 T를 사용하여 상품 정보를 지정할 수 있도록 하세요.
    2. productsController 클래스를 만들어 다양한 상품 정보를 저장하고 출력하는 코드를 작성하세요.
    3. 각 상품에 대해 이름과 정보를 지정하고 출력하세요.

    실행 예
        products(Name=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD)
        products(Name=Smartphone, productInfo=799.99)
        products(Name=Available, productInfo=true)

 */
public class ProductsMain {
    public static void main(String[] args) {
        Products<String> products1 = new Products<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD");
        // int -> Integer처럼 double 자료형 역시 클래스화 돼 있는 Double이 있습니다.
        Products<Double> products2 = new Products<>("Smartphone", 799.99);
        // boolean도 Boolean이 있습니다.
        Products<Boolean> products3 = new Products<>("Available", true);
        System.out.println(products1);
        System.out.println(products2);
        System.out.println(products3);
    }
}
