package br.infnet.infnetfood.domain.data.model.restaurante;


import br.infnet.infnetfood.domain.data.model.gerente.Gerente;
import br.infnet.infnetfood.domain.data.model.refeicao.Refeicao;
import br.infnet.infnetfood.domain.data.printer.IPrinter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Restaurante implements IPrinter {

    private Boolean ativo;
    private Boolean aberto;
    private BigDecimal taxaFrete;
    private LocalDateTime dataPedido;

    private Gerente gerente;

    private Set<Refeicao> refeicoes;

    public Restaurante(final Gerente gerente) {
        this.gerente = gerente;
        this.dataPedido = LocalDateTime.now();
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(BigDecimal taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    public Set<Refeicao> getRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes(Set<Refeicao> refeicoes) {
        this.refeicoes = refeicoes;
    }

    @Override
    public String toString() {
        return "Active: " + ativo + "; Open: " + aberto + "; Freight Fee: " + taxaFrete + "; Order Date: " + getDataPedido() + "; Gerente: " + gerente + "; Refeições: " + refeicoes.size();
    }

    private String getDataPedido() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
        return dataPedido.format(formatter);
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }
}
