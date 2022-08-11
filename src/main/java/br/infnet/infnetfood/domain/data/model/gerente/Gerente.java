package br.infnet.infnetfood.domain.data.model.gerente;

import br.infnet.infnetfood.domain.data.printer.IPrinter;

public class Gerente implements IPrinter {

    private final Integer matricula;
    private final String nome;
    private final String senha;

    public Gerente(final Integer matricula, final String nome, final String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Registry: " + matricula + "; Name: " + nome + "; Password: " + senha;
    }

    @Override
    public void impressao() {
        System.out.println("Gerente");
        System.out.println(this);
    }
}
