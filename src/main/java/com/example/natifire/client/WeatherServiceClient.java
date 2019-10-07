package com.example.natifire.client;

import com.example.natifire.model.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "localhost:8080/weather", value = "Weather-Client")
public interface WeatherServiceClient {

    @GetMapping("/")
    List<WeatherDTO> findAllWeather();

    @GetMapping(value = "/byCity/{city}")
    List<WeatherDTO> findByCity(@PathVariable String city);

    @GetMapping("/setCities/{city1}/{city2}")
    public List<WeatherDTO> setCities(
            @PathVariable String city1,
            @PathVariable String city2);
}
