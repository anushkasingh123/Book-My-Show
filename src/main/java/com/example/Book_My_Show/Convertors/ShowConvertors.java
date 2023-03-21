package com.example.Book_My_Show.Convertors;

import com.example.Book_My_Show.EntryDtos.ShowEntryDto;
import com.example.Book_My_Show.Models.ShowEntity;



public class ShowConvertors {
    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}
