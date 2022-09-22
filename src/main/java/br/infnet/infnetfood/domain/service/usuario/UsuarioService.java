package br.infnet.infnetfood.domain.service.usuario;

import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.repository.usuario.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void create(final Usuario usuario) {
        usuarioRepository.create(usuario);
        usuario.impressao();
    }

    public Collection<Usuario> getAll() {
        System.out.println("Find Users...");
        return usuarioRepository.getAll();
    }

    public void remove(final Integer id) {
        usuarioRepository.remove(id);
    }

    public Usuario getByEmail(final String email) {
        return usuarioRepository.getByEmail(email);
    }
}
