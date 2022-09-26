package br.infnet.infnetfood.infrastructure.repository.order;

import br.infnet.infnetfood.domain.data.model.order.Order;
import br.infnet.infnetfood.domain.repository.order.OrderRepository;
import br.infnet.infnetfood.infrastructure.persistence.order.OrderMySQLRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

@Component
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderMySQLRepository repository;

    public OrderRepositoryImpl(final OrderMySQLRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Order> getAllOrders() {
        return (Collection<Order>) repository.findAll();
    }

    @Override
    public void createOrder(final Order order) {
        order.setUuid(UUID.randomUUID().toString());
        order.setCreateDate(LocalDate.now());
        repository.save(order);
    }
}
