package fafenterprise.dev.gograduation.entity.uno;


import fafenterprise.dev.gograduation.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransationEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "value", nullable = false, precision = 10, scale = 2)
    private BigDecimal value;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "type", nullable = false)
    private TransactionType type;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name =  "group_id")
    private GroupEntity group;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UserEntity user;





}
