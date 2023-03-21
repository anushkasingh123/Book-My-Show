package com.example.Book_My_Show.Convertors;

import com.example.Book_My_Show.EntryDtos.MovieEntryDto;
import com.example.Book_My_Show.Models.MovieEntity;

public class MovieConvertor {
    public static MovieEntity convertEntryDtoToEntity(MovieEntryDto movieEntryDto){

        MovieEntity movieEntity = MovieEntity.builder()
                .movieName(movieEntryDto.getMovieName()).duration(movieEntryDto.getDuration())
                .genre(movieEntryDto.getGenre()).language(movieEntryDto.getLanguage()).ratings(movieEntryDto.getRatings()).build();

        return movieEntity;
    }

}
