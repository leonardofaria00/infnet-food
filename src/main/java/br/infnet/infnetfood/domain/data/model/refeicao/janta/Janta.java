package br.infnet.infnetfood.domain.data.model.refeicao.janta;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;
import br.infnet.infnetfood.domain.exception.JantaException;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.MathContext;

@Entity
@Table(name = "T_janta")
public class Janta extends Refeicao implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private TipoJanta tipoJanta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTipoJanta(TipoJanta tipoJanta) {
        this.tipoJanta = tipoJanta;
    }

    public TipoJanta getTipoJanta() {
        return tipoJanta;
    }

    @Override
    public BigDecimal calcularVenda() {
        if (getValor() == null) {
            throw new JantaException("Valor da janta deve ser preenchido");
        }
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
