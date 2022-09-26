package br.infnet.infnetfood.domain.data.model.order;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_order")
public class Order implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String uuid;

    private String descricao;

    private LocalDate createDate;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idGerente")
    private Gerente gerente;

    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Refeicao> refeicaos;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Order() {

    }

    public Order(final OrderBuilder builder) {
        descricao = builder.getDescricao();
        gerente = builder.getGerente();
        refeicaos = builder.getRefeicaos();
        usuario = builder.getUsuario();
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

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Refeicao> getRefeicaos() {
        return refeicaos;
    }

    public void setRefeicaos(List<Refeicao> refeicaos) {
        this.refeicaos = refeicaos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}