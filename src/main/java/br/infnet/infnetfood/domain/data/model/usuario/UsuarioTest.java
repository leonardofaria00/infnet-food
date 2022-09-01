package br.infnet.infnetfood.domain.data.model.usuario;

import br.infnet.infnetfood.controller.UsuarioController;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UsuarioTest implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Usuário");

        Usuario usuario = new Usuario();
        usuario.setUuid(UUID.randomUUID().toString());
        usuario.setNome("Admin");
        usuario.setEmail("admin@admin.com");
        usuario.setSenha("123");
        UsuarioController.create(usuario);
    }
}
