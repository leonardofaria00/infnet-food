package br.infnet.infnetfood.domain.data.model.restaurante;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class Restaurante {

    private String nome;
    private BigDecimal taxaFrete;
    private Boolean ativo;
    private Boolean aberto;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
}
