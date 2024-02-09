package com.generation.trejava.model.dto.Train;

import java.util.List;

import com.generation.trejava.model.entities.Line;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TrainDtoBase {
    
    private Integer id;
    private String serial_number, type;
    private Double average_speed;
    private int capacity;
    // private List<Line> railwayLine;
}
