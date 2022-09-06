package br.infnet.infnetfood.domain.data.model.usuario;

import br.infnet.infnetfood.controller.UsuarioController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTest implements ApplicationRunner {

    @Autowired
    private UsuarioController controller;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Usuário");
        controller.create("Admin", "admin@admin.com", "123");
    }
}
