package eshop.adda.eshoppingadda.controller;

import eshop.adda.eshoppingadda.model.WishlistItem;
import eshop.adda.eshoppingadda.model.User;
import eshop.adda.eshoppingadda.service.WishlistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {
    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping("/{userId}")
    public List<WishlistItem> getWishlistByUser(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        return wishlistService.getWishlistByUser(user);
    }

    @PostMapping
    public WishlistItem addWishlistItem(@RequestBody WishlistItem item) {
        return wishlistService.saveWishlistItem(item);
    }

    @DeleteMapping("/{id}")
    public void removeWishlistItem(@PathVariable Long id) {
        wishlistService.removeWishlistItem(id);
    }
}