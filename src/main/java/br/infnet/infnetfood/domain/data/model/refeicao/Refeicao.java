package br.infnet.infnetfood.domain.data.model.refeicao;

import br.infnet.infnetfood.domain.data.model.utils.ModelUtils;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Refeicao extends ModelUtils implements IPrinter {

    private String uuid;
    private String nome;
    private BigDecimal valor;

    public abstract BigDecimal calcularVenda();

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
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
