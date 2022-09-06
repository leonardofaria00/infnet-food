package br.infnet.infnetfood.infrastructure.repository.dinner;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import br.infnet.infnetfood.domain.repository.dinner.DinnerRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class DinnerRepositoryImpl implements DinnerRepository {
    public static Map<String, Janta> map = new HashMap<>();

    @Override
    public Collection<Janta> getAll() {
        return map.values();
    }

    @Override
    public void remove(final String uuid) {
        map.remove(uuid);
        System.out.printf("Deleted uuid: %s%n", uuid);
    }

    @Override
    public void create(final Janta janta) {
        map.put(janta.getUuid(), janta);
    }
}
