package br.infnet.infnetfood.domain.repository.order;

import br.infnet.infnetfood.domain.data.model.order.Order;

import java.util.Collection;

public interface OrderRepository {

    Collection<Order> getAllOrders();

    void createOrder(Order order);
}
