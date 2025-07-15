package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.WishlistItem;
import eshop.adda.eshoppingadda.model.User;
import java.util.List;

public interface WishlistService {
    List<WishlistItem> getWishlistByUser(User user);
    WishlistItem saveWishlistItem(WishlistItem item);
    void removeWishlistItem(Long id);
}