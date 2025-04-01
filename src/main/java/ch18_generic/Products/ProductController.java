package ch18_generic.Products;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 =
                new Product<>("Laptop", "Intel i7, 16BGB RAM, 512GB SSD");

        Product<Double> product2 =
                new Product<>("Smartphone", 799.99);

        Product<Boolean> product3 =
                new Product<>("Available", true);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
