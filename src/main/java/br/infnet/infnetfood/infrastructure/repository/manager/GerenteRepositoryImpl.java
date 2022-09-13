package br.infnet.infnetfood.infrastructure.repository.manager;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.repository.manager.GerenteRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class GerenteRepositoryImpl implements GerenteRepository {

    public static Map<Integer, Gerente> map = new HashMap<>();

    @Override
    public void create(final Gerente gerente) {
        map.put(gerente.getMatricula(), gerente);
    }

    @Override
    public Collection<Gerente> getList() {
        return map.values();
    }

    @Override
    public void remove(final Integer matricula) {
        map.remove(matricula);
    }
}
