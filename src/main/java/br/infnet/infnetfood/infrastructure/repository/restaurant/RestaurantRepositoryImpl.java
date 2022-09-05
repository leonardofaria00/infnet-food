package br.infnet.infnetfood.infrastructure.repository.restaurant;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;
import br.infnet.infnetfood.domain.repository.restaurant.RestaurantRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    public static Map<String, Restaurante> map = new HashMap<>();

    @Override
    public void remove(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @Override
    public void addRestaurant(final Restaurante restaurante) {
        map.put(restaurante.getUuid(), restaurante);
    }

    @Override
    public Collection<Restaurante> getRestaurant() {
        return map.values();
    }
}
