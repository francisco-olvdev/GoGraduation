package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.relationship.GroupUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupUserRepository extends JpaRepository<GroupUserEntity, UUID> {
}
