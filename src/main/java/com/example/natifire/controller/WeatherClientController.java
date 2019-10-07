package com.example.natifire.controller;

import com.example.natifire.client.WeatherServiceClient;
import com.example.natifire.model.WeatherDTO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weatherClient")
@Api(value = "Weather Client Management System")
public class WeatherClientController {

    @Autowired
    private WeatherServiceClient weatherServiceClient;

    @GetMapping("/findAllAccounts")
    public List<WeatherDTO> findAllAccounts() {
        return weatherServiceClient.findAllWeather();
    }

    @GetMapping("/byCity/{city}")
    public List<WeatherDTO> findByCity(@PathVariable String city) {
        return weatherServiceClient.findByCity(city);
    }

    @GetMapping("/setCities/{city1}/{city2}")
    public List<WeatherDTO> setCities(
            @PathVariable String city1,
            @PathVariable String city2) {
        return weatherServiceClient.setCities(city1, city2);
    }
}
