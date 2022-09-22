package br.infnet.infnetfood.domain.data.model.refeicao.petisco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;
import br.infnet.infnetfood.domain.exception.PetiscoException;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.MathContext;

@Entity
@Table(name = "T_petisco")
public class Petisco extends Refeicao implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private TipoPetisco tipoPetisco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTipoPetisco(TipoPetisco tipoPetisco) {
        this.tipoPetisco = tipoPetisco;
    }

    public TipoPetisco getTipoPetisco() {
        return tipoPetisco;
    }

    @Override
    public BigDecimal calcularVenda() {
        if (getValor() == null) {
            throw new PetiscoException("Valor do petisco deve ser preenchido");
        }
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
