package br.infnet.infnetfood.infrastructure.repository.usuario;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.repository.usuario.UsuarioRepository;
import br.infnet.infnetfood.infrastructure.persistence.UsuarioMySQLRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.UUID;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final UsuarioMySQLRepository repository;

    public UsuarioRepositoryImpl(final UsuarioMySQLRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(final Usuario usuario) {
        usuario.setUuid(UUID.randomUUID().toString());
        repository.save(usuario);
    }

    @Override
    public Collection<Usuario> getAll() {
        return (Collection<Usuario>) repository.findAll();
    }

    @Override
    public void remove(final Integer id) {
        repository.deleteById(id);
        System.out.printf("Deleted account: %s%n", id);
    }

    @Override
    public Usuario getByEmail(final String email) {
        return repository.getByEmail(email);
    }
}
