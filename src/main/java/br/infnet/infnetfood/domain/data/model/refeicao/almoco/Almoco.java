package br.infnet.infnetfood.domain.data.model.refeicao.almoco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;

public class Almoco extends Refeicao {

    private String ingrediente;

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Ingredient: " + ingrediente;
    }
}
