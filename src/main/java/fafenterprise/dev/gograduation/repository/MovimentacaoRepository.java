package fafenterprise.dev.gograduation.repository;

import fafenterprise.dev.gograduation.entity.uno.MovimentacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovimentacaoRepository extends JpaRepository<MovimentacaoEntity, UUID> {
}
