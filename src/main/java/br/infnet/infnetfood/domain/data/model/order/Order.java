package br.infnet.infnetfood.domain.data.model.order;

import br.infnet.infnetfood.domain.data.printer.IPrinter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_order")
public class Order implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String uuid;

    private String descricao;

    private LocalDate createDate;

    public Order() {

    }

    public Order(OrderBuilder builder) {
        descricao = builder.getDescricao();
//        gerente = builder.getGerente();
//        refeicaos = builder.getRefeicaos();
//        usuario = builder.getUsuario();
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}