package com.generation.trejava.model.dto.Ticket;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@Data
@SuperBuilder
public class TicketDtoR extends TicketDtoBase
{
    public TicketDtoR(){};
}
