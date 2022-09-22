package br.infnet.infnetfood.infrastructure.repository.dinner;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import br.infnet.infnetfood.domain.repository.dinner.DinnerRepository;
import br.infnet.infnetfood.infrastructure.persistence.DinnerMySQLRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.UUID;

@Component
public class DinnerRepositoryImpl implements DinnerRepository {

    private final DinnerMySQLRepository repository;

    public DinnerRepositoryImpl(final DinnerMySQLRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Janta> getAll() {
        return (Collection<Janta>) repository.findAll();
    }

    @Override
    public void remove(final Integer id) {
        repository.deleteById(id);
        System.out.printf("Deleted registry: %s%n", id);
    }

    @Override
    public void create(final Janta janta) {
        janta.setUuid(UUID.randomUUID().toString());
        repository.save(janta);
    }
}
