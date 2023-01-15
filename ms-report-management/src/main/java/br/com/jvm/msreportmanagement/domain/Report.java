package br.com.jvm.msreportmanagement.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "report")
@Tag(name = "Report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(name = "id", example = "1")
    private Long id;

    @Schema(name = "date", type = "date", example = "2023-01-15T18:52:26.064-03:00")
    private LocalDateTime date = LocalDateTime.now();

    @Schema(name = "value", type = "BigDecimal", example = "19.90")
    private BigDecimal value;
}
