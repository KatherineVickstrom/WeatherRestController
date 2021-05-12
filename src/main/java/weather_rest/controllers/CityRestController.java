package weather_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import weather_rest.domain.*;
import weather_rest.service.CityService;
 
@RestController
public class CityRestController {
        
        @Autowired
        private CityService cityService;
        
        @GetMapping("/api/cities/{city}")
        public CityInfo getWeather(@PathVariable("city") String cityName) {
           CityInfo cityInfo = cityService.getCityInfo(cityName);
           if (cityInfo == null) {
             throw new ResponseStatusException(HttpStatus.NOT_FOUND, cityName + " not found");
           }
           return cityInfo;
        }
}

