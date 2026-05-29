package fafenterprise.dev.gograduation.entity.relationship;


import fafenterprise.dev.gograduation.entity.uno.GroupEntity;
import fafenterprise.dev.gograduation.entity.uno.UserEntity;
import fafenterprise.dev.gograduation.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "group_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupUserEntity {
    @Id
    @GeneratedValue
    private UUID id;


    @JoinColumn(name = "user")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    @JoinColumn(name = "group_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupEntity group;


    @Column(name = "join_at", nullable = false)
    @NotBlank
    private LocalDate joinAt;


    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    @NotBlank
    private Role role;


}
