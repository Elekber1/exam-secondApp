package com.example.natifire.service;

import com.example.natifire.model.WeatherDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NatifireServiceImpl implements NatifireService {



    @Override
    public List<WeatherDTO> findWeatherByCity(String city) {

        return null;
    }
}
