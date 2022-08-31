package br.infnet.infnetfood.domain.data.model.gerente;

import br.infnet.infnetfood.domain.data.printer.IPrinter;
import br.infnet.infnetfood.domain.exception.GerenteException;

import java.util.Objects;

public class Gerente implements IPrinter {

    private final Integer matricula;
    private final String nome;
    private final String senha;

    public Gerente(final Integer matricula, final String nome, final String senha) {

        if (Objects.isNull(matricula)) {
            throw new GerenteException("Matrícula não pode ser nula");
        }

        if (nome.isBlank() || nome.isEmpty()) {
            throw new GerenteException("Nome não pode ser vario");
        }

        if (senha.isBlank() || senha.isEmpty()) {
            throw new GerenteException("Senha não pode ser vario");
        }

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
        System.out.println(this);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
