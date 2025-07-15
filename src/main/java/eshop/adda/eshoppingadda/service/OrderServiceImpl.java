package eshop.adda.eshoppingadda.service;

import eshop.adda.eshoppingadda.model.Order;
import eshop.adda.eshoppingadda.model.User;
import eshop.adda.eshoppingadda.repository.OrderRepository; // Make sure this path matches your actual package structure
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrdersByUser(User user) {
        return orderRepository.findByUser(user);
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}