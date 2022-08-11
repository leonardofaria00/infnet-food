package br.infnet.infnetfood.domain.data.model.restaurante;


import br.infnet.infnetfood.domain.data.printer.IPrinter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Restaurante implements IPrinter {

    private Boolean ativo;
    private Boolean aberto;
    private BigDecimal taxaFrete;
    private LocalDateTime dataPedido;

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public void setTaxaFrete(BigDecimal taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    @Override
    public String toString() {
        return "Active: " + ativo + "; Open: " + aberto + "; Freight Fee: " + taxaFrete + "; Order Date: " + getDataPedido();
    }

    private String getDataPedido() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss.SSS");
        return dataPedido.format(formatter);
    }

    @Override
    public void impressao() {
        System.out.println("Restaurante");
        System.out.println(this);
    }
}
