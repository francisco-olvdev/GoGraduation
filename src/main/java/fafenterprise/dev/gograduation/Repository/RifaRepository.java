package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.uno.RifaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RifaRepository extends JpaRepository<RifaEntity, UUID> {
}
