package fafenterprise.dev.gograduation.services;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Service;

import fafenterprise.dev.gograduation.entity.relationship.GroupUserEntity;
import fafenterprise.dev.gograduation.entity.uno.GroupEntity;
import fafenterprise.dev.gograduation.entity.uno.UserEntity;
import fafenterprise.dev.gograduation.enums.Role;
import fafenterprise.dev.gograduation.repository.GroupRepository;
import fafenterprise.dev.gograduation.repository.GroupUserRepository;
import fafenterprise.dev.gograduation.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GroupUserService {
    final GroupUserRepository groupUserRepo;
    final UserRepository userRepo;
    final GroupRepository groupRepo;

    public void create(UUID createdBy, UUID groupId){
        GroupUserEntity groupUser = new GroupUserEntity();
        GroupEntity group = groupRepo.findById(groupId).orElseThrow();
        UserEntity user = userRepo.findById(createdBy).orElseThrow();
        
        groupUser.setUser(user);
        groupUser.setGroup(group);
        groupUser.setJoinAt(LocalDate.now());
        groupUser.setRole(Role.ADMIN);

        groupUserRepo.save(groupUser);

    }
}
