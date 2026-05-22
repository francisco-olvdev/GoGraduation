package fafenterprise.dev.gograduation.services;


import fafenterprise.dev.gograduation.dto.request.GroupRequestDTO;
import fafenterprise.dev.gograduation.dto.response.GroupResponseDTO;
import fafenterprise.dev.gograduation.entity.uno.GroupEntity;
import fafenterprise.dev.gograduation.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {

    final GroupRepository groupRepository;

    public GroupResponseDTO create(GroupRequestDTO groupRequestDTO) {

        GroupEntity groupEntity = new GroupEntity();

        groupEntity.setName(groupRequestDTO.name());
        groupEntity.setCourse(groupRequestDTO.course());
        groupEntity.setGoal(groupRequestDTO.goal());
        groupEntity.setTeam(groupRequestDTO.team());
        groupEntity.setToken(RandomStringUtils.secure().nextAlphanumeric(7));
        groupEntity.setCreatedAt(LocalDateTime.now());
        groupEntity.setUpdatedAt(LocalDateTime.now());

        GroupEntity newGroup = groupRepository.save(groupEntity);

        return new GroupResponseDTO(
            newGroup.getId(), newGroup.getName(), newGroup.getGoal(), newGroup.getTeam()
        );

    }

    public List<GroupResponseDTO> findAll() {
        return groupRepository.findAll()
                .stream()
                .map(group -> new GroupResponseDTO(
                        group.getId(),
                        group.getName(),
                        group.getGoal(),
                        group.getTeam()
                )).toList();
    }



}
