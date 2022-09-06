package br.infnet.infnetfood.infrastructure.repository.usuario;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.repository.usuario.UsuarioRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository {

    public static Map<String, Usuario> map = new HashMap<>();

    @Override
    public void create(final Usuario usuario) {
        usuario.setUuid(UUID.randomUUID().toString());
        map.put(usuario.getEmail(), usuario);
    }

    @Override
    public Collection<Usuario> getAll() {
        return map.values();
    }

    @Override
    public void remove(final String email) {
        map.remove(email);
        System.out.printf("Deleted account: %s%n", email);
    }

    @Override
    public Usuario getByEmail(final String email) {
        return map.get(email);
    }
}
