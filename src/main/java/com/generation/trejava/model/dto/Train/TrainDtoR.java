package com.generation.trejava.model.dto.Train;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@Data
@SuperBuilder
public class TrainDtoR extends TrainDtoBase {
    public TrainDtoR() {
    }
}
