package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.tabelapropria.RifaVendedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RifaVendedorRepository extends JpaRepository<RifaVendedorEntity, UUID> {
}
