package fafenterprise.dev.gograduation.entity.tabelapropria;


import fafenterprise.dev.gograduation.entity.uno.MensalidadeEntity;
import fafenterprise.dev.gograduation.entity.uno.UsuarioEntity;
import fafenterprise.dev.gograduation.enums.StatusAdesao;
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
    @GeneratedValue
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
