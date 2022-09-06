package br.infnet.infnetfood.domain.repository.launch;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;

import java.util.Collection;

public interface LaunchRepository {

    void create(Almoco almoco);

    Collection<Almoco> getAll();

    void remove(String uuid);
}
