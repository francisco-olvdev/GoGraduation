package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.uno.DespesasPrevistasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DesPrevistasRepository extends JpaRepository<DespesasPrevistasEntity, UUID> {
}
