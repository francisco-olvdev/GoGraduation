package fafenterprise.dev.gograduation.entity.uno;


import fafenterprise.dev.gograduation.entity.tabelapropria.RifaVendedorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Rifas")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RifaEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome")
    private String nomeRifa;

    @JoinColumn(name = "grupo_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private GrupoEntity grupo;

    @Column(name = "valor")
    private BigDecimal valorRifa;

    @Column(name = "total_bilhetes")
    private Integer totalBilhetes;

    @OneToMany(mappedBy = "rifa")
    private List<RifaVendedorEntity> vendedor;


}
