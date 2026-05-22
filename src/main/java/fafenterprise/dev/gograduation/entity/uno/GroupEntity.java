package fafenterprise.dev.gograduation.entity.uno;


import fafenterprise.dev.gograduation.entity.relationship.GroupUserEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "grops")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @Column(name = "goal", nullable = false, precision = 10, scale = 2)
    private BigDecimal goal;

    @Column(name = "team", nullable = false)
    @NotBlank
    private String team;

    @Column(name = "course", nullable = false)
    @NotBlank
    private String course;

    @Column(name = "token", nullable = false, unique = true)
    private String token;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;


    @OneToMany(mappedBy = "group")
    private List<GroupUserEntity> users;

    @OneToMany(mappedBy = "group")
    private List<TransationEntity> transations;

    @OneToMany(mappedBy = "group")
    private List<MonthlyFeeEntity> monthlyFees;

    @OneToMany(mappedBy = "group")
    private List<ExpenseEntity> expenses;

    @OneToMany(mappedBy = "group")
    private List<RaffleEntity> raffles;
}