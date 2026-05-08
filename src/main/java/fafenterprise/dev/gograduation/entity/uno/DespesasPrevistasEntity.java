package fafenterprise.dev.gograduation.entity.uno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "despesas_previstas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DespesasPrevistasEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @JoinColumn(name = "grupo_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private GrupoEntity grupo;


    @Column(nullable = false, length = 100)
    private String descricao;

    @Column(nullable = false, name = "valor")
    private BigDecimal valor;

}
