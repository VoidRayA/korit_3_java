package ch17_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        // 객체 생성
//        ProductView productView1 = new ProductView();
        // ProductView.java에 생성자를 private로 선언했기 때문에 오류 발생
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();

        // 이상의 코드에서 복수의 객체를 만든 것처럼 보이지만 실제로
        // ProductView.getInstance();의 결과 값은 동일한 instance이기 때문에
        // 실제 생성된 객체의 개수는 한 개 밖에 없음.
        
        // 콘솔창에 이상의 코드를 실행시킨 결과로
        // 1 번 째 객체가 생성되었습니다. 가 한 줄만 출력되었습니다.
        
        // 적어도 static 변수로 counter를 선언했다면
        // 1, 2, 3, 4번째 객체가 생성되었습니다, 로 네 줄이 출력되든지
        
        // 그게 아니라 여러분이 충분히 사려깊게 코드를 봤다면
        // 생성자 내부의 int counter가 지역변수이기 때문에
        // 1 번째 객체가 생성되었습니다.
        // 1 번째 객체가 생성되었습니다.
        // 1 번째 객체가 생성되었습니다.
        // 1 번째 객체가 생성되었습니다.
        // 로 네 줄이 출력되어야하는데,
        
        // 한 번만 출력되었다는 것을 생성 호출 자체가 한 번만 있었다는 의미

        productView1.showMainView();
        productView2.showMainView();
    }
}
