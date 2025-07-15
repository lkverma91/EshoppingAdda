package eshop.adda.eshoppingadda.repository;

import eshop.adda.eshoppingadda.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}