package com.generation.trejava.model.dto.Passenger;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class PassengerDtoWplus extends PassengerDtoBase{

    private int totTicket;
    private double totExp;
}
