package br.infnet.infnetfood.domain.data.model.gerente;

public class Gerente {

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
}
