package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        // 정적 메서드의 호출
        System.out.println(Product.getCount());

        // 객체 생성
        Product product1 = new Product();
        
        // count / instanceCount 값 확인
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product1.getInstanceCount());    // 일반 메서드 호출

        // 객체 생성
        Product product2 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product2.getInstanceCount());    // 일반 메서드 호출

        System.out.println("product1 : "+ product1.getInstanceCount()) ;

        Product product3 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product3.getInstanceCount());    // 일반 메서드 호출Product product2 = new Product();
        Product product4 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product4.getInstanceCount());    // 일반 메서드 호출Product product2 = new Product();
        Product product5 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product5.getInstanceCount());    // 일반 메서드 호출Product product2 = new Product();
        Product product6 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product6.getInstanceCount());    // 일반 메서드 호출Product product2 = new Product();
        Product product7 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product7.getInstanceCount());    // 일반 메서드 호출
        Product product8 = new Product();
        System.out.println(Product.getCount());             // 정적 메서드 호출
        System.out.println(product8.getInstanceCount());    // 일반 메서드 호출

        // 롬북을 사용하지 않은 getTitle()
        System.out.println(Product.getTitle());         // 클래스명.메서드명()으로 static 메서드 호출
        // ch08_methods에서는 왜 call1()으로 호출할 수 있었는지에 대한 답변이 필요함.
    }
}
