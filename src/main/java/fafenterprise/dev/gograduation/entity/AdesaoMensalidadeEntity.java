package fafenterprise.dev.gograduation.entity;


import fafenterprise.dev.gograduation.enums.StatusAdesao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
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
