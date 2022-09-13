package br.infnet.infnetfood.domain.data.model.gerente;

import br.infnet.infnetfood.controller.GerenteController;
import br.infnet.infnetfood.domain.service.manager.GerenteService;
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
class GerenteTest implements ApplicationRunner {

    @Autowired
    private GerenteService service;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Gerente");

        final Gerente g1 = new Gerente(2022123, "Maria", "@#$%%");
        new GerenteController(service).create(g1);

        final Gerente g2 = new Gerente(2022456, "João", "!@#$%¨&*");
        new GerenteController(service).create(g2);

        final Gerente g3 = new Gerente(2022789, "José", "@#153777999");
        new GerenteController(service).create(g3);

        populateManagerWithReadFile();
    }

    private void populateManagerWithReadFile() {
        String diretorio = "src/main/resources/";
        String arquivo = "gerente.txt";

        try {
            System.out.println("START READ FILE");
            FileReader fileReader = new FileReader(diretorio + arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String row = bufferedReader.readLine();
            while (row != null) {
                String[] campos = row.split(";");
                Gerente gerente = new Gerente(Integer.valueOf(campos[0]), campos[1], campos[2]);
                new GerenteController(service).create(gerente);
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