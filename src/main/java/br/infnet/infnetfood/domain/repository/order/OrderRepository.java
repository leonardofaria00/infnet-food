package br.infnet.infnetfood.domain.repository.order;

import br.infnet.infnetfood.domain.data.model.order.Order;

public interface OrderRepository {

    Order getAllOrders();

    void createOrder(Order order);
}
