package br.infnet.infnetfood.domain.data.model.usuario;

import br.infnet.infnetfood.domain.data.printer.IPrinter;

import javax.persistence.*;

@Entity
@Table(name = "T_usuario")
public class Usuario implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String uuid;
    private String nome;
    private String email;
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
