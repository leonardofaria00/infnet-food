package br.infnet.infnetfood.domain.data.model.refeicao.janta;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

import java.math.BigDecimal;
import java.math.MathContext;

public class Janta extends Refeicao implements IPrinter {

    private TipoJanta tipoJanta;

    public void setTipoJanta(TipoJanta tipoJanta) {
        this.tipoJanta = tipoJanta;
    }

    public TipoJanta getTipoJanta() {
        return tipoJanta;
    }

    @Override
    public BigDecimal calcularVenda() {
        return getValor().multiply(BigDecimal.valueOf(1.5), MathContext.DECIMAL64);
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Dinner Type: " + tipoJanta.getType();
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }
}
