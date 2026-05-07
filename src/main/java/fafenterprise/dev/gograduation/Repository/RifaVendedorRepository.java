package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.tabelapropria.RifaVendedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RifaVendedorRepository extends JpaRepository<RifaVendedorEntity, UUID> {
}
