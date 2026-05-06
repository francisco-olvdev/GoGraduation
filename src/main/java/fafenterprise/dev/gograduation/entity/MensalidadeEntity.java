package fafenterprise.dev.gograduation.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Mensalidades")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MensalidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column (name = "valor", nullable = false, precision = 20, scale = 2)
    private BigDecimal valor;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "grupo_id")
    private GrupoEntity grupo;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "dia_cobranca")
    private Integer diaCobranca;


    @OneToMany(mappedBy = "mensalidade")
    private List<AdesaoMensalidadeEntity> adesaoMensalidade;









}
