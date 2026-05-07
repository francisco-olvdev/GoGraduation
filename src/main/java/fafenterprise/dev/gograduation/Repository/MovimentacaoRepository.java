package fafenterprise.dev.gograduation.Repository;

import fafenterprise.dev.gograduation.Entity.uno.MovimentacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovimentacaoRepository extends JpaRepository<MovimentacaoEntity, UUID> {
}
