package br.infnet.infnetfood.domain.data.model.order;


import br.infnet.infnetfood.controller.OrderController;
import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.service.order.OrderService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
class OrderTest implements ApplicationRunner {

    private final OrderService service;

    public OrderTest(final OrderService service) {
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Pedido");
        PopulateOrder();
    }

    private void PopulateOrder() {
        final String diretorio = "src/main/resources/";
        final String arquivo = "pedido.txt";

        try {
            System.out.println("START READ FILE");
            FileReader fileReader = new FileReader(diretorio + arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String row = bufferedReader.readLine();
            while (row != null) {
                String[] campos = row.split(";");


                final Order order = new OrderBuilder()
                        .descricao(campos[0])
                        .gerente(getGerente(campos))
                        .refeicaos(getRefeicoes(campos))
                        .usuario(getUsuario(campos))
                        .build();
                new OrderController(service).createOrder(order);
                row = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (final Exception e) {
            throw new RuntimeException("Error: >>> " + e.getMessage());
        } finally {
            System.out.println("FINISHED READ FILE!");
        }
    }

    private List<Refeicao> getRefeicoes(final String[] campos) {
        List<Refeicao> refeicoes = new ArrayList<>();
        final Almoco refeicao = new Almoco();
        refeicao.setId(1);
        refeicao.setUuid(UUID.randomUUID().toString());
        refeicao.setNome(campos[1]);
        refeicao.setIngrediente(campos[2]);
        refeicao.setValor(BigDecimal.valueOf(Long.parseLong(campos[3])));
        refeicoes.add(refeicao);
        return refeicoes;
    }

    private Usuario getUsuario(final String[] campos) {
        Usuario usuario = new Usuario();

        usuario.setId(1);
        usuario.setUuid(UUID.randomUUID().toString());
        usuario.setNome(campos[7]);
        usuario.setEmail(campos[8]);
        usuario.setSenha(campos[9]);
        usuario.setRefeicaos(getRefeicoes(campos));

        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(getGerente(campos));
        usuario.setGerentes(gerentes);
        return usuario;
    }

    private Gerente getGerente(final String[] campos) {
        Gerente gerente = new Gerente(Integer.valueOf(campos[4]), campos[5], campos[6]);
        gerente.setId(1);
        return gerente;
    }
}