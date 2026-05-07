package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.uno.DespesasPrevistasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DesPrevistasRepository extends JpaRepository<DespesasPrevistasEntity, UUID> {
}
