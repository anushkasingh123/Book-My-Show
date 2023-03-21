package com.example.Book_My_Show.Convertors;

import com.example.Book_My_Show.EntryDtos.TicketEntryDto;
import com.example.Book_My_Show.Models.TicketEntity;

public class TicketConvertors {
    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        return new TicketEntity();
    }
}
