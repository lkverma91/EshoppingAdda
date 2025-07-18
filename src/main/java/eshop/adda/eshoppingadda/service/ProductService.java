package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct(Product product);
    void deleteProduct(Long id);
}