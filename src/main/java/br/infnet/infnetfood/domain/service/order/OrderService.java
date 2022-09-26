package br.infnet.infnetfood.domain.service.order;

import br.infnet.infnetfood.domain.data.model.order.Order;
import br.infnet.infnetfood.domain.repository.order.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public void createOrder(final Order order) {
        orderRepository.createOrder(order);
        System.out.println("Order saved");
    }
}
