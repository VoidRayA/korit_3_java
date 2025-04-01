package ch18_generic.Products;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product<T> {
    private String productName;
    private T productInfo;
}
