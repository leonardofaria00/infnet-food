package br.infnet.infnetfood.domain.repository.restaurant;

import br.infnet.infnetfood.domain.data.model.restaurante.Restaurante;

import java.util.Collection;

public interface RestaurantRepository {
    void remove(Integer id);

    void create(Restaurante restaurante);

    Collection<Restaurante> getAll();
}
