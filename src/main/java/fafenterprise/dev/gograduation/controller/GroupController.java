package fafenterprise.dev.gograduation.controller;

import fafenterprise.dev.gograduation.dto.request.GroupRequestDTO;
import fafenterprise.dev.gograduation.dto.response.GroupResponseDTO;
import fafenterprise.dev.gograduation.services.GroupService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping
    public List<GroupResponseDTO> listAll(){
        return groupService.listAll();
    }

    @PutMapping("/{id}")
    public GroupResponseDTO update(@PathVariable UUID id, @RequestBody GroupRequestDTO group){
        return groupService.update(id, group);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        groupService.delete(id);
    }

}
