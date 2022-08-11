package br.infnet.infnetfood.domain.data.model.refeicao.janta;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

public class Janta extends Refeicao implements IPrinter {

    private TipoJanta tipoJanta;

    public void setTipoJanta(TipoJanta tipoJanta) {
        this.tipoJanta = tipoJanta;
    }

    @Override
    public float calcularVenda() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Dinner Type : " + tipoJanta.getType();
    }

    @Override
    public void impressao() {
        System.out.println("Janta");
        System.out.println(this);
    }
}
