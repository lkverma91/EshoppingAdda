package eshop.adda.eshoppingadda.repository;

import eshop.adda.eshoppingadda.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}