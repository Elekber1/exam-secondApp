package com.example.natifire.service;

import com.example.natifire.model.WeatherDTO;

import java.util.List;

public interface NatifireService {

    List<WeatherDTO> findWeatherByCity(String city);
}
