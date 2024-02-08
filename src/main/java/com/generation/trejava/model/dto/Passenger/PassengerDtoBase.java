package com.generation.trejava.model.dto.Passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PassengerDtoBase {

    private Integer id;
    private String name,surname;
    private int age;
}
