package br.infnet.infnetfood.domain.data.model.refeicao.petisco;

import br.infnet.infnetfood.controller.SnackController;
import br.infnet.infnetfood.domain.service.snack.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Order(3)
@Component
class PetiscoTest implements ApplicationRunner {

    @Autowired
    private SnackService service;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Petiscos");

        final Petisco p1 = new Petisco();
        p1.setUuid(UUID.randomUUID().toString());
        p1.setNome("Isca de Tilápia");
        p1.setValor(BigDecimal.valueOf(75.00));
        p1.setTipoPetisco(TipoPetisco.PEIXE);
        new SnackController(service).create(p1, "Inclusão de petisco Isca de Tilápia");

        final Petisco p2 = new Petisco();
        p2.setUuid(UUID.randomUUID().toString());
        p2.setNome("Carne de Sol");
        p2.setTipoPetisco(TipoPetisco.CARNE);
        p2.setValor(BigDecimal.valueOf(120.00));
        new SnackController(service).create(p2, "Inclusão de petisco Carne de sol");

        final Petisco p3 = new Petisco();
        p3.setUuid(UUID.randomUUID().toString());
        p3.setNome("Camarão na Manteiga Acebolado");
        p3.setTipoPetisco(TipoPetisco.CAMARAO);
        p3.setValor(BigDecimal.valueOf(110.00));
        new SnackController(service).create(p3, "Inclusão de petisco Camarão na manteiga acebolada");
    }
}