package br.infnet.infnetfood.domain.data.model.restaurante;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Order(2)
@Component
class RestauranteTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Restaurante");
        final Restaurante r1 = new Restaurante();
        r1.setAtivo(true);
        r1.setAberto(true);
        r1.setTaxaFrete(BigDecimal.valueOf(5));
        r1.setDataPedido(LocalDateTime.now());
        System.out.println(r1);

        final Restaurante r2 = new Restaurante();
        r2.setAtivo(false);
        r2.setAberto(true);
        r2.setTaxaFrete(BigDecimal.valueOf(10));
        r2.setDataPedido(LocalDateTime.now());
        System.out.println(r2);

        final Restaurante r3 = new Restaurante();
        r3.setAtivo(true);
        r3.setAberto(false);
        r3.setTaxaFrete(BigDecimal.valueOf(20));
        r3.setDataPedido(LocalDateTime.now());
        System.out.println(r3);
    }
}