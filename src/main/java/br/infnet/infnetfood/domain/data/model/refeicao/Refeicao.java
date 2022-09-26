package br.infnet.infnetfood.domain.data.model.refeicao;

import br.infnet.infnetfood.domain.data.model.order.Order;
import br.infnet.infnetfood.domain.data.model.usuario.Usuario;
import br.infnet.infnetfood.domain.data.model.utils.ModelUtils;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "T_refeicao")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Refeicao extends ModelUtils implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String uuid;
    private String nome;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToMany(mappedBy = "refeicaos")
    private List<Order> orders;

    public abstract BigDecimal calcularVenda();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Uuid: " + uuid + "; Name: " + nome + "; Value: " + valor + "; Valor Venda: " + calcularVenda();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refeicao refeicao = (Refeicao) o;
        return Objects.equals(uuid, refeicao.uuid);
    }
}
