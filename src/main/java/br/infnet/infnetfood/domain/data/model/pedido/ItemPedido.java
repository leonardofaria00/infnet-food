package br.infnet.infnetfood.domain.data.model.pedido;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ItemPedido {

    private Integer quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
    private String observacao;
}
