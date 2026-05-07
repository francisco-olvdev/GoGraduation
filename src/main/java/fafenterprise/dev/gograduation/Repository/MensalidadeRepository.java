package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.uno.MensalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MensalidadeRepository extends JpaRepository<MensalidadeEntity, UUID> {
}
