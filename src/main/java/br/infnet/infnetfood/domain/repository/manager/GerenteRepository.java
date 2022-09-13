package br.infnet.infnetfood.domain.repository.manager;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;

import java.util.Collection;

public interface GerenteRepository {

    void create(Gerente gerente);

    Collection<Gerente> getList();

    void remove(Integer matricula);
}
