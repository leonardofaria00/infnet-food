package br.infnet.infnetfood.domain.data.model.refeicao.petisco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

import java.math.BigDecimal;
import java.math.MathContext;

public class Petisco extends Refeicao implements IPrinter {

    private TipoPetisco tipoPetisco;

    public void setTipoPetisco(TipoPetisco tipoPetisco) {
        this.tipoPetisco = tipoPetisco;
    }

    @Override
    public BigDecimal calcularVenda() {
        return getValor().multiply(BigDecimal.valueOf(3), MathContext.DECIMAL64);
    }

    @Override
    public String toString() {
        return "Type: " + tipoPetisco.getType() + "; " + super.toString();
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }
}
