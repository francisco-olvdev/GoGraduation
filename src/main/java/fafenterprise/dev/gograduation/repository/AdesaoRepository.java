package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.tabelapropria.AdesaoMensalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdesaoRepository extends JpaRepository<AdesaoMensalidadeEntity, UUID> {
}
