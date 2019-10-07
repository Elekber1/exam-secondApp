package com.example.natifire.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {


    private Long id;
    private String city;
    private LocalDate date;
    private String temp;
}
