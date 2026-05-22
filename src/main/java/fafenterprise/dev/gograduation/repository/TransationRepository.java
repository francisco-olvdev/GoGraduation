package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.uno.TransationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransationRepository extends JpaRepository<TransationEntity, UUID> {
}
