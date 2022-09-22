package br.infnet.infnetfood.infrastructure.persistence;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteMySQLRepository extends CrudRepository<Gerente, Integer> {
}
