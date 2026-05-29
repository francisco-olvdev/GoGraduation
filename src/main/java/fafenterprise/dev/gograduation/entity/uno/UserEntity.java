package fafenterprise.dev.gograduation.entity.uno;

import fafenterprise.dev.gograduation.entity.relationship.GroupUserEntity;
import fafenterprise.dev.gograduation.entity.relationship.SubscriptionEntity;
import fafenterprise.dev.gograduation.entity.relationship.RaffleSellerEntity;
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
@Table(name = "User")

public class UserEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column (name = "name", nullable = false)
    private String name;

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
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_At", nullable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user")
    private List<GroupUserEntity> groups;

    @OneToMany(mappedBy = "user")
    private List<TransactionEntity> transations;

    @OneToMany(mappedBy = "user")
    private List<SubscriptionEntity> monthlyFee;

    @OneToMany(mappedBy = "user")
    private List<RaffleSellerEntity> raffles;

}