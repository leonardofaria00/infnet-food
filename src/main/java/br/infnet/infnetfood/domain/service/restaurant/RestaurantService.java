package br.infnet.infnetfood.domain.service.restaurant;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;
import br.infnet.infnetfood.domain.repository.restaurant.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(final RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void remove(final Integer id) {
        restaurantRepository.remove(id);
    }

    public void create(final Restaurante restaurante) {
        restaurantRepository.create(restaurante);
        restaurante.impressao();
    }

    public Collection<Restaurante> getAll() {
        System.out.println("Find Restaurants...");
        return restaurantRepository.getAll();
    }
}
