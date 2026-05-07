package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.tabelapropria.PagamentoMensalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PagamentoMensalidadeRepository extends JpaRepository<PagamentoMensalidadeEntity, UUID> {
}
