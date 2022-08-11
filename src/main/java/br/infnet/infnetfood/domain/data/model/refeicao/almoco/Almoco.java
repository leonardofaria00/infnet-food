package br.infnet.infnetfood.domain.data.model.refeicao.almoco;

import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

public class Almoco extends Refeicao implements IPrinter {

    private String ingrediente;

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public float calcularVenda() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Ingredient: " + ingrediente;
    }

    @Override
    public void impressao() {
        System.out.println("Almoço");
        System.out.println(this);
    }
}
