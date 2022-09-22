package br.infnet.infnetfood.infrastructure.repository.snack;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
import br.infnet.infnetfood.domain.repository.snack.SnackRepository;
import br.infnet.infnetfood.infrastructure.persistence.SnackMySQLRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.UUID;

@Component
public class SnackRepositoryImpl implements SnackRepository {

    private final SnackMySQLRepository repository;

    public SnackRepositoryImpl(final SnackMySQLRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(final Petisco petisco) {
        petisco.setUuid(UUID.randomUUID().toString());
        repository.save(petisco);
    }

    @Override
    public Collection<Petisco> getAll() {
        return (Collection<Petisco>) repository.findAll();
    }

    @Override
    public void remove(final Integer id) {
        repository.deleteById(id);
    }
}
