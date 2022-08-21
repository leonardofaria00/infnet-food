package br.infnet.infnetfood.domain.data.model.refeicao.janta;

import br.infnet.infnetfood.controller.DinnerController;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Order(5)
@Component
class JantaTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Janta");
        final Janta j1 = new Janta();
        j1.setUuid(UUID.randomUUID().toString());
        j1.setNome("Salada Caesar de Camarão");
        j1.setValor(BigDecimal.valueOf(35.00));
        j1.setTipoJanta(TipoJanta.NEGOCIOS);
        DinnerController.addDinner(j1, "Inclusão de janta Salada");

        final Janta j2 = new Janta();
        j2.setUuid(UUID.randomUUID().toString());
        j2.setNome("Bobó de Camarão (2 pessoas)");
        j2.setValor(BigDecimal.valueOf(246, 2));
        j2.setTipoJanta(TipoJanta.ROMANTICO);
        DinnerController.addDinner(j2, "Inclusão de janta Bobó de Camarão");

        final Janta j3 = new Janta();
        j3.setUuid(UUID.randomUUID().toString());
        j3.setNome("Brownie de Chocolate");
        j3.setValor(BigDecimal.valueOf(35.00));
        j3.setTipoJanta(TipoJanta.LAZER);
        DinnerController.addDinner(j3, "Inclusão de janta Brownie");
    }
}