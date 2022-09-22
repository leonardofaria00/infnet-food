package br.infnet.infnetfood.infrastructure.persistence;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaunchMySQLRepository extends CrudRepository<Almoco, Integer> {
}
