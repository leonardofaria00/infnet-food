package br.infnet.infnetfood.domain.data.model.refeicao;

import java.math.BigDecimal;

public abstract class Refeicao {

    private String uuid;
    private String nome;
    private BigDecimal valor;

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Uuid: " + uuid + "; Name: " + nome + "; Value: " + valor;
    }
}
