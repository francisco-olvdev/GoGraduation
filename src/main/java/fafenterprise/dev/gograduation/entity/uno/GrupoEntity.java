package fafenterprise.dev.gograduation.entity.uno;


import fafenterprise.dev.gograduation.entity.tabelapropria.GrupoUsuarioEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Grupos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GrupoEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome", nullable = false)
    @NotBlank
    private String nome;

    @Column(name = "meta", nullable = false, precision = 10, scale = 2)
    private BigDecimal meta;

    @Column(name = "turma", nullable = false)
    @NotBlank
    private String turma;

    @Column(name = "curso", nullable = false)
    @NotBlank
    private String curso;

    @Column(name = "token", nullable = false, unique = true)
    private UUID token;

    @Column(name = "data_criacao", nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "data_atualizacao", nullable = false)
    private LocalDate dataAtualizacao;


    @OneToMany(mappedBy = "grupo")
    private List<GrupoUsuarioEntity> usuarios;

    @OneToMany(mappedBy = "grupo")
    private List<MovimentacaoEntity> movimentacoes;

    @OneToMany(mappedBy = "grupo")
    private List<MensalidadeEntity> mensalidades;

    @OneToMany(mappedBy = "grupo")
    private List<DespesasPrevistasEntity> despesasPrevistas;

    @OneToMany(mappedBy = "grupo")
    private List<RifaEntity> rifas;
}