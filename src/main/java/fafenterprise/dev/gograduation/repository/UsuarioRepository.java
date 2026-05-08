package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.uno.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UUID> {
}
