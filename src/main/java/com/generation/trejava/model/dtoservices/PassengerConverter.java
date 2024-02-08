package com.generation.trejava.model.dtoservices;

import org.springframework.stereotype.Service;

import com.generation.trejava.model.dto.Passenger.PassengerDtoR;
import com.generation.trejava.model.dto.Passenger.PassengerDtoWplus;
import com.generation.trejava.model.entities.Passenger;
import com.generation.trejava.model.entities.Ticket;

@Service
public class PassengerConverter {

    public PassengerDtoR PassengerToDtoR (Passenger e)
    {
        return PassengerDtoR
               .builder()
               .id(e.getId())
               .name(e.getName())
               .surname(e.getSurname())
               .age(e.getAge())
               .build(); 
    } 

    public PassengerDtoWplus PassengerToDtoWplus (Passenger e)
    {
        return PassengerDtoWplus
               .builder()
               .id(e.getId())
               .name(e.getName())
               .surname(e.getSurname())
               .age(e.getAge())
               .totTicket(e.getTicketBought().size())
               .totExp(calcTotExp(e))
               .build(); 
    }

    public double calcTotExp(Passenger e)
    {

        if(e.getTicketBought()==null)
            return 0;
        
            double res = 0;

        for(Ticket t:e.getTicketBought())
            res+=t.getBase_price();
            // metti if con gli sconti
        
        return res;
 
    }

    // i peperoni?
}
