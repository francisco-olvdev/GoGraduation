package fafenterprise.dev.gograduation.services;


import fafenterprise.dev.gograduation.dto.request.GroupRequestDTO;
import fafenterprise.dev.gograduation.dto.response.GroupResponseDTO;
import fafenterprise.dev.gograduation.entity.uno.GrupoEntity;
import fafenterprise.dev.gograduation.repository.GrupoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class GroupService {

    final GrupoRepository grupoRepository;

    public GroupResponseDTO create(GroupRequestDTO groupRequestDTO) {

        GrupoEntity grupoEntity = new GrupoEntity();

        grupoEntity.setNome(groupRequestDTO.name());
        grupoEntity.setCurso(groupRequestDTO.course());
        grupoEntity.setMeta(groupRequestDTO.goal());
        grupoEntity.setTurma(groupRequestDTO.team());
        grupoEntity.setToken(RandomStringUtils.randomAlphanumeric(7));
        grupoEntity.setDataCriacao(LocalDateTime.now());
        grupoEntity.setDataAtualizacao(LocalDateTime.now());

        GrupoEntity newGroup = grupoRepository.save(grupoEntity);

        return new GroupResponseDTO(
            newGroup.getId(), newGroup.getNome(), newGroup.getMeta()

        );


    }

}
