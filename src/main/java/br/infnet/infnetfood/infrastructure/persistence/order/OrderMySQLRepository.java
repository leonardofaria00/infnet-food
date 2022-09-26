package br.infnet.infnetfood.infrastructure.persistence.order;

import br.infnet.infnetfood.domain.data.model.order.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMySQLRepository extends CrudRepository<Order, Integer> {
}
