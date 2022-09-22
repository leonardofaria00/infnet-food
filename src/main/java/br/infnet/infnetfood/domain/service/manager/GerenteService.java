package br.infnet.infnetfood.domain.service.manager;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.repository.manager.GerenteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GerenteService {

    private final GerenteRepository repository;

    public GerenteService(final GerenteRepository repository) {
        this.repository = repository;
    }

    public void create(final Gerente gerente) {
        repository.create(gerente);
        gerente.impressao();
    }

    public Collection<Gerente> getList() {
        return repository.getList();
    }

    public void remove(final Integer id) {
        repository.remove(id);
        System.out.printf("Deleted registry: %s%n", id);
    }
}
