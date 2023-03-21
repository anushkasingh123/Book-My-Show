package com.example.Book_My_Show.EntryDtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserEntryDto {


    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
}

