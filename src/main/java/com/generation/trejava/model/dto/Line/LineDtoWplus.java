package com.generation.trejava.model.dto.Line;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class LineDtoWplus extends LineDtoBase {
    private Double duration;
    private LocalDateTime arrivalTime;
}
