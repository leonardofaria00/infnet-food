package br.infnet.infnetfood.domain.data.model.gerente;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
class GerenteTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Gerente");

        final Gerente g1 = new Gerente(2022123, "Maria", "@#$%%");
        System.out.println(g1);

        final Gerente g2 = new Gerente(2022456, "João", "!@#$%¨&*");
        System.out.println(g2);

        final Gerente g3 = new Gerente(2022789, "José", "@#153777999");
        System.out.println(g3);

    }
}