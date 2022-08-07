package br.infnet.infnetfood.domain.data.model.refeicao.janta;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;

public class Janta extends Refeicao {

    private TipoJanta tipoJanta;

    public void setTipoJanta(TipoJanta tipoJanta) {
        this.tipoJanta = tipoJanta;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Dinner Type : " + tipoJanta.getType();
    }
}
