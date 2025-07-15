package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.Review;
import eshop.adda.eshoppingadda.model.Product;
import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByProduct(Product product);
    Review saveReview(Review review);
}