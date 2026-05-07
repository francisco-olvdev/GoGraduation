package fafenterprise.dev.gograduation.Entity.uno;

import fafenterprise.dev.gograduation.Entity.tabelapropria.AdesaoMensalidadeEntity;
import fafenterprise.dev.gograduation.Entity.tabelapropria.GrupoUsuarioEntity;
import fafenterprise.dev.gograduation.Entity.tabelapropria.RifaVendedorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class UsuarioEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column (name = "nome", nullable = false)
    private String nome;

    @NotBlank
    @Column (name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank
    @Column(name = "telefone", nullable = false, unique = true)
    private String telefone;

    @NotBlank
    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @NotBlank
    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "data_atualizacao", nullable = false)
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "usuario")
    private List<GrupoUsuarioEntity> grupos;

    @OneToMany(mappedBy = "usuario")
    private List<MovimentacaoEntity> movimentacoes;

    @OneToMany(mappedBy = "usario")
    private List<AdesaoMensalidadeEntity> mensalidades;

    @OneToMany(mappedBy = "usuario")
    private List<RifaVendedorEntity> rifas;

}