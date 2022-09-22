package br.infnet.infnetfood.infrastructure.persistence;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioMySQLRepository extends CrudRepository<Usuario, Integer> {

    Usuario getByEmail(String email);
}
