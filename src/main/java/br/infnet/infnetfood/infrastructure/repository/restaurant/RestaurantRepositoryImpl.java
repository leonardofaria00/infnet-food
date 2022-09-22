package br.infnet.infnetfood.infrastructure.repository.restaurant;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;
import br.infnet.infnetfood.domain.repository.restaurant.RestaurantRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    public static Map<Integer, Restaurante> map = new HashMap<>();
    public static Integer ID = 0;

    @Override
    public void remove(final Integer id) {
        map.remove(id);
        System.out.printf("Deleted registry: %s%n", id);
    }

    @Override
    public void create(final Restaurante restaurante) {
        restaurante.setId(++ID);
        map.put(restaurante.getId(), restaurante);
    }

    @Override
    public Collection<Restaurante> getAll() {
        return map.values();
    }
}
