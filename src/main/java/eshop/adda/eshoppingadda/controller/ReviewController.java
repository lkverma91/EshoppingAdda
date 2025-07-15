package eshop.adda.eshoppingadda.controller;

import eshop.adda.eshoppingadda.model.Review;
import eshop.adda.eshoppingadda.model.Product;
import eshop.adda.eshoppingadda.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{productId}")
    public List<Review> getReviewsByProduct(@PathVariable Long productId) {
        Product product = new Product();
        product.setId(productId);
        return reviewService.getReviewsByProduct(product);
    }

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }
}