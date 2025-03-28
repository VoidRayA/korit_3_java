package ch12_inheritance.products;
/*
    1. field 선언 private String name, private String category
    2. AllArgsConstructor를 생성하세요(필드 전체를 다 사용하는 생성자)
    3. Setter / Getter
    4. Product.Java에서 Item - 부모 클래스 / Product - 자식 클래스
 */
public class Item {
    private String name;
    private String category;

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
