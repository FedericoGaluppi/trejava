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
public class LineDtoBase {

    private Integer id;
    private String departure_station,destination_station;
    private Double lenght;
    private LocalDateTime departure_time;
}