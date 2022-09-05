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

    public void removeRestaurant(final String uuid) {
        restaurantRepository.remove(uuid);
    }

    public void addRestaurant(final Restaurante restaurante) {
        restaurantRepository.addRestaurant(restaurante);
        restaurante.impressao();
    }

    public Collection<Restaurante> getRestaurant() {
        System.out.println("Find Restaurants...");
        return restaurantRepository.getRestaurant();
    }
}
