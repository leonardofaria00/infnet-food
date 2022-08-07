package br.infnet.infnetfood.domain.data.model.restaurante;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Restaurante {

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
        return "Ativo: " + ativo + "; Aberto: " + aberto + "; Taxa Frete: " + taxaFrete + "; Data Pedido: " + getDataPedido();
    }

    private String getDataPedido() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss.SSS");
        return dataPedido.format(formatter);
    }
}
