package br.infnet.infnetfood.infrastructure.persistence;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinnerMySQLRepository extends CrudRepository<Janta, Integer> {
}
