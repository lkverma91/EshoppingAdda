package eshop.adda.eshoppingadda.repository;

import eshop.adda.eshoppingadda.model.Review;
import eshop.adda.eshoppingadda.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProduct(Product product);
}