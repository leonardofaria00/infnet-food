package br.infnet.infnetfood.infrastructure.persistence;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnackMySQLRepository extends CrudRepository<Petisco, Integer> {
}
