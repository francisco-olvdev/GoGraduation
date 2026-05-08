package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.tabelapropria.GrupoUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GrupoUsuarioRepository extends JpaRepository<GrupoUsuarioEntity, UUID> {
}
