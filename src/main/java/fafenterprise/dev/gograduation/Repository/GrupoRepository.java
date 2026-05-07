package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.uno.GrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GrupoRepository extends JpaRepository<GrupoEntity, UUID> {
}
