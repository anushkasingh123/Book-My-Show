package com.example.Book_My_Show.Convertors;

import com.example.Book_My_Show.EntryDtos.TheaterEntryDto;
import com.example.Book_My_Show.Models.TheaterEntity;

public class TheaterConvertor {
    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }
}
