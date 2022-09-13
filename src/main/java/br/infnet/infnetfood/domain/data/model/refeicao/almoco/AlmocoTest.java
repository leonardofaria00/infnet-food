package br.infnet.infnetfood.domain.data.model.refeicao.almoco;

import br.infnet.infnetfood.controller.LaunchController;
import br.infnet.infnetfood.domain.service.launch.LaunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

@Order(4)
@Component
class AlmocoTest implements ApplicationRunner {

    @Autowired
    private LaunchService service;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Almoço");

        final Almoco a1 = new Almoco();
        a1.setNome("Lasanha de berinjela");
        a1.setIngrediente("Beringela, tomate fresco, molho de tomate");
        a1.setValor(BigDecimal.valueOf(85.00));
        new LaunchController(service).create(a1, "Inclusão de almoço Lasanha");
        a1.calcularVenda();

        final Almoco a2 = new Almoco();
        a2.setNome("Moqueca de banana");
        a2.setIngrediente("Banana, arroz branco, pirão e farofa");
        a2.setValor(BigDecimal.valueOf(145.00));
        new LaunchController(service).create(a2, "Inclusão de almoço Moqueca");
        a2.calcularVenda();

        final Almoco a3 = new Almoco();
        a3.setNome("Ratatouille");
        a3.setIngrediente("Beringela, tomate fresco, cebola roxa e abobrinha");
        a3.setValor(BigDecimal.valueOf(47.00));
        new LaunchController(service).create(a3, "Inclusão de almoço Ratatouille");
        a3.calcularVenda();

        populateFoodWithReadFile();
    }

    private void populateFoodWithReadFile() {
        String diretorio = "src/main/resources/";
        String arquivo = "almoco.txt";

        try {
            System.out.println("START READ FILE");
            FileReader fileReader = new FileReader(diretorio + arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String row = bufferedReader.readLine();
            while (row != null) {
                String[] campos = row.split(";");
                Almoco almoco = new Almoco();
                almoco.setNome(campos[0]);
                almoco.setIngrediente(campos[1]);
                almoco.setValor(BigDecimal.valueOf(Long.parseLong(campos[2])));
                new LaunchController(service).create(almoco, "Inclusão via arquivo");
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