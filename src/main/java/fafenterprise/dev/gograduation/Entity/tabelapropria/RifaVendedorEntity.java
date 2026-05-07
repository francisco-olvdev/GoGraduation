package fafenterprise.dev.gograduation.Entity.tabelapropria;


import fafenterprise.dev.gograduation.Entity.uno.RifaEntity;
import fafenterprise.dev.gograduation.Entity.uno.UsuarioEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table (name = "Rifa_Vendedo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class RifaVendedorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @JoinColumn (name = "rifa_id")
    @ManyToOne (fetch = FetchType.LAZY)
    private RifaEntity rifa;

    @JoinColumn (name = "usuario_id")
    @ManyToOne (fetch = FetchType.LAZY)
    private UsuarioEntity usuario;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column (name = "valor_devido")
    protected BigDecimal valorDevido;

}
