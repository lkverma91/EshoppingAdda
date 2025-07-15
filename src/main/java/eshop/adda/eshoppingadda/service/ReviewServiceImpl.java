package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.Review;
import eshop.adda.eshoppingadda.model.Product;
import eshop.adda.eshoppingadda.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getReviewsByProduct(Product product) {
        return reviewRepository.findByProduct(product);
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }
}