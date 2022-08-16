package br.infnet.infnetfood.domain.data.model.restaurante;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import br.infnet.infnetfood.domain.data.model.refeicao.janta.TipoJanta;
import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
import br.infnet.infnetfood.domain.data.model.refeicao.petisco.TipoPetisco;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Order(2)
@Component
class RestauranteTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Restaurante");
        Set<Refeicao> refeicaos1 = new HashSet<>();

        final Almoco a1 = new Almoco();
        a1.setUuid(UUID.randomUUID().toString());
        a1.setNome("Lasanha de berinjela");
        a1.setIngrediente("Beringela, tomate fresco, molho de tomate");
        a1.setValor(BigDecimal.valueOf(85.00));

        final Janta j1 = new Janta();
        j1.setUuid(UUID.randomUUID().toString());
        j1.setNome("Salada Caesar de Camarão");
        j1.setValor(BigDecimal.valueOf(35.00));
        j1.setTipoJanta(TipoJanta.NEGOCIOS);

        final Petisco p1 = new Petisco();
        p1.setUuid(UUID.randomUUID().toString());
        p1.setNome("Isca de Tilápia");
        p1.setValor(BigDecimal.valueOf(75.00));
        p1.setTipoPetisco(TipoPetisco.PEIXE);

        refeicaos1.add(a1);
        refeicaos1.add(j1);
        refeicaos1.add(p1);

        Gerente g1 = new Gerente(2022123, "Gerente 1", "@#$%%");
        final Restaurante r1 = new Restaurante(g1);
        r1.setAtivo(true);
        r1.setAberto(true);
        r1.setTaxaFrete(BigDecimal.valueOf(5));
        r1.setRefeicoes(refeicaos1);
        r1.impressao();

        //------------------------

        Set<Refeicao> refeicaos2 = new HashSet<>();

        final Almoco a2 = new Almoco();
        a2.setUuid(UUID.randomUUID().toString());
        a2.setNome("Moqueca de banana");
        a2.setIngrediente("Banana, arroz branco, pirão e farofa");
        a2.setValor(BigDecimal.valueOf(145.00));

        final Janta j2 = new Janta();
        j2.setUuid(UUID.randomUUID().toString());
        j2.setNome("Bobó de Camarão (2 pessoas)");
        j2.setValor(BigDecimal.valueOf(246, 2));
        j2.setTipoJanta(TipoJanta.ROMANTICO);

        final Petisco p2 = new Petisco();
        p2.setUuid(UUID.randomUUID().toString());
        p2.setNome("Carne de Sol");
        p2.setTipoPetisco(TipoPetisco.CARNE);
        p2.setValor(BigDecimal.valueOf(120.00));

        refeicaos2.add(a2);
        refeicaos2.add(j2);
        refeicaos2.add(p2);

        Gerente g2 = new Gerente(2022456, "Gerente 2", "!@#$%¨&*");
        final Restaurante r2 = new Restaurante(g2);
        r2.setAtivo(false);
        r2.setAberto(true);
        r2.setTaxaFrete(BigDecimal.valueOf(10));
        r2.setRefeicoes(refeicaos2);
        r2.impressao();

        //------------------------

        Set<Refeicao> refeicaos3 = new HashSet<>();

        final Almoco a3 = new Almoco();
        a3.setUuid(UUID.randomUUID().toString());
        a3.setNome("Ratatouille");
        a3.setIngrediente("Beringela, tomate fresco, cebola roxa e abobrinha");
        a3.setValor(BigDecimal.valueOf(47.00));

        final Janta j3 = new Janta();
        j3.setUuid(UUID.randomUUID().toString());
        j3.setNome("Brownie de Chocolate");
        j3.setValor(BigDecimal.valueOf(35.00));
        j3.setTipoJanta(TipoJanta.LAZER);

        final Petisco p3 = new Petisco();
        p3.setUuid(UUID.randomUUID().toString());
        p3.setNome("Camarão na Manteiga Acebolado");
        p3.setTipoPetisco(TipoPetisco.CAMARAO);
        p3.setValor(BigDecimal.valueOf(110.00));

        refeicaos3.add(a3);
        refeicaos3.add(j3);
        refeicaos3.add(p3);

        Gerente g3 = new Gerente(2022789, "Gerente 3", "@#153777999");
        final Restaurante r3 = new Restaurante(g3);
        r3.setAtivo(true);
        r3.setAberto(false);
        r3.setTaxaFrete(BigDecimal.valueOf(20));
        r3.setRefeicoes(refeicaos3);
        r3.impressao();
    }
}