package br.infnet.infnetfood.infrastructure.repository.launch;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.repository.launch.LaunchRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class LaunchRepositoryImpl implements LaunchRepository {
    public static Map<String, Almoco> map = new HashMap<>();

    @Override
    public void create(final Almoco almoco) {
        almoco.setUuid(UUID.randomUUID().toString());
        map.put(almoco.getUuid(), almoco);
    }

    @Override
    public Collection<Almoco> getAll() {
        return map.values();
    }

    @Override
    public void remove(final String uuid) {
        map.remove(uuid);
    }
}
