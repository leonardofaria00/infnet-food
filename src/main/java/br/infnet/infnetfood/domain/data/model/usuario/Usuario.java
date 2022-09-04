package br.infnet.infnetfood.domain.data.model.usuario;

import br.infnet.infnetfood.domain.data.printer.IPrinter;

public class Usuario implements IPrinter {

    private String uuid;
    private String nome;
    private String email;
    private String senha;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Uuid: " + uuid + "; Nome: " + nome + "; Email: " + email + "; Senha:" + senha;
    }
}
