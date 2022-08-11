package br.infnet.infnetfood.domain.data.model.refeicao.petisco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

public class Petisco extends Refeicao implements IPrinter {

    private TipoPetisco tipoPetisco;

    public void setTipoPetisco(TipoPetisco tipoPetisco) {
        this.tipoPetisco = tipoPetisco;
    }

    @Override
    public float calcularVenda() {
        return 0;
    }

    @Override
    public String toString() {
        return "Type: " + tipoPetisco.getType() + "; " + super.toString();
    }

    @Override
    public void impressao() {
        System.out.println("Petisco");
        System.out.println(this);
    }
}
