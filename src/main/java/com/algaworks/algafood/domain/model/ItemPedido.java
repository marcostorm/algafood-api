package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private BigDecimal precoUnitario;

    private BigDecimal precoTotal;

    private Integer quantidade;

    private String observacao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;
}
