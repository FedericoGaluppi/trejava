package com.generation.trejava.model.dto.Ticket;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TicketDtoWplus extends TicketDtoBase 
{

    private String passAnagr;
    private double effectivePrice;
}
