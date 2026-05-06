package fafenterprise.dev.gograduation.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.UUID;

@Entity
@Table(name = "pagamento_mensalidade")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoMensalidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @JoinColumn (name = "adesao_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AdesaoMensalidadeEntity adesao;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    @Column(name = "valor_pago")
    private BigDecimal valorPago;

    @Column(name = "referencia")
    private YearMonth referencia;
}
