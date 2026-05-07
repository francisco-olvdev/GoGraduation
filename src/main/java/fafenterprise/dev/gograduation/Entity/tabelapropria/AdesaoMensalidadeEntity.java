package fafenterprise.dev.gograduation.Entity.tabelapropria;


import fafenterprise.dev.gograduation.Entity.uno.MensalidadeEntity;
import fafenterprise.dev.gograduation.Entity.uno.UsuarioEntity;
import fafenterprise.dev.gograduation.Enums.StatusAdesao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Adesao_mensalidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdesaoMensalidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;


    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsuarioEntity usuario;

    @JoinColumn(name = "mensalidade_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private MensalidadeEntity mensalidade;

    @Column(name = "data_adesao")
    private LocalDate dataAdesao;

    @Column(name = "status")
    private StatusAdesao status;




}
