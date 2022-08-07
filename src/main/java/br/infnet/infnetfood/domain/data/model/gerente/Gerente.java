package br.infnet.infnetfood.domain.data.model.gerente;

import br.infnet.infnetfood.domain.data.model.utils.ModelUtils;

public class Gerente extends ModelUtils {

    private Integer matricula;
    private String nome;
    private String senha;

    public Gerente(final Integer matricula, final String nome, final String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return matricula + ";" + nome + ";" + senha;
    }
}
