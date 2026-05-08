package fafenterprise.dev.gograduation.controller;

import fafenterprise.dev.gograduation.dto.request.UsuarioRequestDTO;
import fafenterprise.dev.gograduation.dto.response.UsuarioResponseDTO;
import fafenterprise.dev.gograduation.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsuarioController {
    private final UserService userService;

    @PostMapping
    public UsuarioResponseDTO create(@RequestBody UsuarioRequestDTO request) {
        return userService.create(request);
    }

    @GetMapping
    public List<UsuarioResponseDTO> listAll() {
        return userService.listarTodos();
    }

    @PutMapping("/{id}")
    public UsuarioResponseDTO update(@PathVariable UUID id, @RequestBody UsuarioRequestDTO usuario) {
        return userService.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        userService.deletar(id);
    }
}
