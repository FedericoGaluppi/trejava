package com.generation.trejava.model.dto.Train;

import com.generation.trejava.model.entities.Line;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TrainDtoWplus extends TrainDtoBase {
    
    private int routesTravelled;
    private int timeTravelled;
    private int percentageCapacity;
}
