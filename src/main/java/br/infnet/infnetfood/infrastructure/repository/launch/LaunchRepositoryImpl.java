package br.infnet.infnetfood.infrastructure.repository.launch;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.repository.launch.LaunchRepository;
import br.infnet.infnetfood.infrastructure.persistence.LaunchMySQLRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.UUID;

@Component
public class LaunchRepositoryImpl implements LaunchRepository {

    private final LaunchMySQLRepository repository;

    public LaunchRepositoryImpl(final LaunchMySQLRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(final Almoco almoco) {
        almoco.setUuid(UUID.randomUUID().toString());
        repository.save(almoco);
    }

    @Override
    public Collection<Almoco> getAll() {
        return (Collection<Almoco>) repository.findAll();
    }

    @Override
    public void remove(final Integer id) {
        repository.deleteById(id);
    }
}
