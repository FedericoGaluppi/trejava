package com.generation.trejava.model.dto.Passenger;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
@EqualsAndHashCode(callSuper=false)
@Data
@SuperBuilder
public class PassengerDtoWplus extends PassengerDtoBase{

    private int totTicket;
    private double totExp;
}
