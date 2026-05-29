package fafenterprise.dev.gograduation.dto.request;

import java.time.LocalDateTime;

public record UserRequestDTO(
        String name,
        String email,
        String telefone,
        String login,
        String senha
) {
}

