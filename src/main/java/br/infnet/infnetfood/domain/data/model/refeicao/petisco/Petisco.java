package br.infnet.infnetfood.domain.data.model.refeicao.petisco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;

public class Petisco extends Refeicao {

    private TipoPetisco tipoPetisco;

    public void setTipoPetisco(TipoPetisco tipoPetisco) {
        this.tipoPetisco = tipoPetisco;
    }

    @Override
    public String toString() {
        return "Type: " + tipoPetisco.getType() + "; " + super.toString();
    }
}
