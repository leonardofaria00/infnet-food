package br.infnet.infnetfood.domain.repository.snack;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;

import java.util.Collection;

public interface SnackRepository {
    
    void create(Petisco petisco);

    Collection<Petisco> getAll();

    void remove(String uuid);
}
