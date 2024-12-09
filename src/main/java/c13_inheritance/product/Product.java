package c13_inheritance.product;

public class Product extends Item{
    private int price;
    private int stork;

    // RequireArgsConstructor로 만들기 위해 부모 클래스에 없는 필드르 추가합니다.
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        System.out.println("Product가 생성되었습니다.");
        // 여러분들은 기본적으로 사용하던 방식의 생성자 내부에 필드 대입하는 코드를 작성해야 함.
        this.price = price;
        this.stork = stock;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("Product 이름 변경 : " + name);
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        System.out.println("Product 카테고리 변경 : " + category);
        super.setCategory(category);
    }

    // Item 클래스에 없는 필드의 괄련한 setter / getter를 생성하세요 -> 얘내는 override가 아니다

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStork() {
        return stork;
    }

    public void setStork(int stork) {
        this.stork = stork;
    }

    private void displayInfo() {
        System.out.println("제품명 : " + getName() + "\n카테고리 : " +  getCategory());
        System.out.println("가격 : " + getPrice() + "\n재고 : " + getStork());
    }
}
