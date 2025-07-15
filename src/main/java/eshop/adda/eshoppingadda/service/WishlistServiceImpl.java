package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.WishlistItem;
import eshop.adda.eshoppingadda.model.User;
import eshop.adda.eshoppingadda.repository.WishlistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistServiceImpl implements WishlistService {
    private final WishlistRepository wishlistRepository;

    public WishlistServiceImpl(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    @Override
    public List<WishlistItem> getWishlistByUser(User user) {
        return wishlistRepository.findByUser(user);
    }

    @Override
    public WishlistItem saveWishlistItem(WishlistItem item) {
        return wishlistRepository.save(item);
    }

    @Override
    public void removeWishlistItem(Long id) {
        wishlistRepository.deleteById(id);
    }
}