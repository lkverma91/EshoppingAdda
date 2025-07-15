package eshop.adda.eshoppingadda.repository;

import eshop.adda.eshoppingadda.model.WishlistItem;
import eshop.adda.eshoppingadda.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishlistRepository extends JpaRepository<WishlistItem, Long> {
    List<WishlistItem> findByUser(User user);
}