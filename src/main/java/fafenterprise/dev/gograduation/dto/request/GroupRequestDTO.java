package fafenterprise.dev.gograduation.dto.request;

import java.math.BigDecimal;

public record GroupRequestDTO(
        String name,
        BigDecimal goal,
        String team,
        String course
) {

}
