package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.tabelapropria.GrupoUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GrupoUsuarioRepository extends JpaRepository<GrupoUsuarioEntity, UUID> {
}
