package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.tabelapropria.AdesaoMensalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdesaoRepository extends JpaRepository<AdesaoMensalidadeEntity, UUID> {
}
