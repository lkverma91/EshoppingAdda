package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.CartItem;
import eshop.adda.eshoppingadda.model.User;
import java.util.List;

public interface CartService {
    List<CartItem> getCartItemsByUser(User user);
    CartItem addCartItem(CartItem cartItem);
    void removeCartItem(Long id);
}