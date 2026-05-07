package fafenterprise.dev.gograduation.Entity.uno;


import fafenterprise.dev.gograduation.Enums.TipoMovimentacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "movimentacoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_movimentacao", nullable = false)
    private LocalDateTime dataMovimentacao;

    @Column(name = "tipo", nullable = false)
    private TipoMovimentacao tipo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name =  "id_grupo")
    private GrupoEntity grupo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;





}
