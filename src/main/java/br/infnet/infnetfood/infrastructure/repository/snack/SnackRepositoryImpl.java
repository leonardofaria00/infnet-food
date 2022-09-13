package br.infnet.infnetfood.infrastructure.repository.snack;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
import br.infnet.infnetfood.domain.repository.snack.SnackRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class SnackRepositoryImpl implements SnackRepository {
    public static Map<String, Petisco> map = new HashMap<>();

    @Override
    public void create(final Petisco petisco) {
        petisco.setUuid(UUID.randomUUID().toString());
        map.put(petisco.getUuid(), petisco);
    }

    @Override
    public Collection<Petisco> getAll() {
        return map.values();
    }

    @Override
    public void remove(final String uuid) {
        map.remove(uuid);
    }
}
