package fafenterprise.dev.gograduation.services;

import fafenterprise.dev.gograduation.dto.request.UsuarioRequestDTO;
import fafenterprise.dev.gograduation.dto.response.UsuarioResponseDTO;
import fafenterprise.dev.gograduation.entity.uno.UsuarioEntity;
import fafenterprise.dev.gograduation.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    final UsuarioRepository usuarioRepository;

    public UsuarioResponseDTO create(UsuarioRequestDTO request) {
        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setNome(request.name());
        usuario.setEmail(request.email());
        usuario.setTelefone(request.telefone());
        usuario.setLogin(request.login());
        usuario.setSenha(request.senha());
        usuario.setDataCadastro(request.createdAt());
        usuario.setDataAtualizacao(request.updatedAt());

        UsuarioEntity novoUsuario = usuarioRepository.save(usuario);

        return new UsuarioResponseDTO(
            novoUsuario.getId(),
            novoUsuario.getNome(),
            novoUsuario.getEmail(),
            novoUsuario.getTelefone());
    }

    public UsuarioResponseDTO update(UUID id, UsuarioRequestDTO request) {
        UsuarioEntity usuario = usuarioRepository.findById(id).orElseThrow();

        usuario.setNome(request.name());
        usuario.setEmail(request.email());
        usuario.setTelefone(request.telefone());
        usuario.setLogin(request.login());
        usuario.setSenha(request.senha());
        usuario.setDataCadastro(request.createdAt());
        usuario.setDataAtualizacao(LocalDateTime.now());

        UsuarioEntity usuarioAtualizado = usuarioRepository.save(usuario);

        return new UsuarioResponseDTO(
                usuarioAtualizado.getId(),
                usuarioAtualizado.getNome(),
                usuarioAtualizado.getEmail(),
                usuarioAtualizado.getTelefone()
        );

    }
    public List<UsuarioResponseDTO> listarTodos(){
        return usuarioRepository.findAll()
            .stream()
            .map(usuario -> new UsuarioResponseDTO(
                usuario.getId(),
                usuario.getLogin(),
                usuario.getEmail(),
                usuario.getTelefone()))
                .toList();

    }

    public void deletar(UUID id) {
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow();

        usuarioRepository.delete(usuario);
    }




}
