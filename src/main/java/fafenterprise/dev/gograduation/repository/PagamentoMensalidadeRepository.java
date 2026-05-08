package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.tabelapropria.PagamentoMensalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PagamentoMensalidadeRepository extends JpaRepository<PagamentoMensalidadeEntity, UUID> {
}
