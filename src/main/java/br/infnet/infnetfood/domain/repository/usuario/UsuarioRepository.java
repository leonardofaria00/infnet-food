package br.infnet.infnetfood.domain.repository.usuario;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;

import java.util.Collection;

public interface UsuarioRepository {

    void create(Usuario usuario);

    Collection<Usuario> getAll();

    void remove(String uuid);

    Usuario getByEmail(String email);
}
