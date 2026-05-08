package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.uno.RifaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RifaRepository extends JpaRepository<RifaEntity, UUID> {
}
