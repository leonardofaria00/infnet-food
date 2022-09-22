package br.infnet.infnetfood.infrastructure.repository.manager;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.repository.manager.GerenteRepository;
import br.infnet.infnetfood.infrastructure.persistence.GerenteMySQLRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class GerenteRepositoryImpl implements GerenteRepository {

    private final GerenteMySQLRepository repository;

    public GerenteRepositoryImpl(final GerenteMySQLRepository repository) {
        this.repository = repository;
    }


    @Override
    public void create(final Gerente gerente) {
        repository.save(gerente);
    }

    @Override
    public Collection<Gerente> getList() {
        return (Collection<Gerente>) repository.findAll();
    }

    @Override
    public void remove(final Integer id) {
        repository.deleteById(id);
    }
}
