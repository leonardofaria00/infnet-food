package br.infnet.infnetfood.domain.repository.restaurant;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;

import java.util.Collection;

public interface RestaurantRepository {
    void remove(String uuid);

    void addRestaurant(Restaurante restaurante);

    Collection<Restaurante> getRestaurant();
}
