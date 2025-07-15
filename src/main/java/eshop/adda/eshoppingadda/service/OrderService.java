package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.Order;
import eshop.adda.eshoppingadda.model.User;
import java.util.List;

public interface OrderService {
    List<Order> getOrdersByUser(User user);
    Order saveOrder(Order order);
    Order getOrderById(Long id);
}