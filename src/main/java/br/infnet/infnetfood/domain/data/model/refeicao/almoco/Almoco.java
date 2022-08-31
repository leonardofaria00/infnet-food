package br.infnet.infnetfood.domain.data.model.refeicao.almoco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;
import br.infnet.infnetfood.domain.exception.AlmocoException;

import java.math.BigDecimal;
import java.math.MathContext;

public class Almoco extends Refeicao implements IPrinter {

    private String ingrediente;

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    @Override
    public BigDecimal calcularVenda() {
        if (getValor() == null) {
            throw new AlmocoException("Erro ao calcular valor do almoço");
        }
        return getValor().multiply(BigDecimal.valueOf(2), MathContext.DECIMAL64);
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Ingredient: " + ingrediente;
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }
}
