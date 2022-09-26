package br.infnet.infnetfood.domain.data.model.usuario;

import br.infnet.infnetfood.controller.UsuarioController;
import br.infnet.infnetfood.domain.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Order(1)
@Component
public class UsuarioTest implements ApplicationRunner {

    @Autowired
    private UsuarioController controller;

    @Autowired
    private UsuarioService service;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Usuário");
        controller.create("Admin", "admin@admin.com", "123");

        populateUserWithReadFile();
    }

    private void populateUserWithReadFile() {
        String diretorio = "src/main/resources/";
        String arquivo = "user.txt";

        try {
            System.out.println("START READ FILE");
            FileReader fileReader = new FileReader(diretorio + arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String row = bufferedReader.readLine();
            while (row != null) {
                String[] campos = row.split(";");
                new UsuarioController(service).create(campos[0], campos[1], campos[2]);
                row = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("FINISHED READ FILE!");
        }
    }
}
