package br.infnet.infnetfood.domain.data.model.refeicao.almoco;

import br.infnet.infnetfood.controller.LaunchController;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Order(4)
@Component
class AlmocoTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Almoço");

        final Almoco a1 = new Almoco();
        a1.setUuid(UUID.randomUUID().toString());
        a1.setNome("Lasanha de berinjela");
        a1.setIngrediente("Beringela, tomate fresco, molho de tomate");
        a1.setValor(BigDecimal.valueOf(85.00));
        LaunchController.addLaunch(a1, "Inclusão de almoço Lasanha");

        final Almoco a2 = new Almoco();
        a2.setUuid(UUID.randomUUID().toString());
        a2.setNome("Moqueca de banana");
        a2.setIngrediente("Banana, arroz branco, pirão e farofa");
        a2.setValor(BigDecimal.valueOf(145.00));
        LaunchController.addLaunch(a2, "Inclusão de almoço Moqueca");

        final Almoco a3 = new Almoco();
        a3.setUuid(UUID.randomUUID().toString());
        a3.setNome("Ratatouille");
        a3.setIngrediente("Beringela, tomate fresco, cebola roxa e abobrinha");
        a3.setValor(BigDecimal.valueOf(47.00));
        LaunchController.addLaunch(a3, "Inclusão de almoço Ratatouille");
    }
}