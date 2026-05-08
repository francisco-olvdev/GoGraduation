package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.uno.GrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GrupoRepository extends JpaRepository<GrupoEntity, UUID> {
}
