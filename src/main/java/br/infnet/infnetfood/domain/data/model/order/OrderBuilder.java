package br.infnet.infnetfood.domain.data.model.order;

import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.model.usuario.Usuario;

import java.util.List;

public class OrderBuilder {

    private String descricao;

    private Gerente gerente;

    private List<Refeicao> refeicaos;

    private Usuario usuario;

    public String getDescricao() {
        return descricao;
    }

    public OrderBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public OrderBuilder gerente(Gerente gerente) {
        this.gerente = gerente;
        return this;
    }

    public List<Refeicao> getRefeicaos() {
        return refeicaos;
    }

    public OrderBuilder refeicaos(List<Refeicao> refeicaos) {
        this.refeicaos = refeicaos;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public OrderBuilder usuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Order build() {
        return new Order(this);
    }
}
