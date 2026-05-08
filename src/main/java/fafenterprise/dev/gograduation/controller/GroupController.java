package fafenterprise.dev.gograduation.controller;

import fafenterprise.dev.gograduation.dto.request.GroupRequestDTO;
import fafenterprise.dev.gograduation.dto.response.GroupResponseDTO;
import fafenterprise.dev.gograduation.services.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {
    final GroupService groupService;

    @PostMapping
    public GroupResponseDTO create(@RequestBody GroupRequestDTO groupRequestDTO) {
        return groupService.create(groupRequestDTO);
    }

}
