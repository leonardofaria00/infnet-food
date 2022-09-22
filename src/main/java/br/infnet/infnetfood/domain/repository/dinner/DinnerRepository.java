package br.infnet.infnetfood.domain.repository.dinner;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;

import java.util.Collection;

public interface DinnerRepository {

    Collection<Janta> getAll();

    void remove(Integer uuid);

    void create(Janta janta);
}
