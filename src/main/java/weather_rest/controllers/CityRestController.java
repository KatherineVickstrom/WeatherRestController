package weather_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import weather_rest.domain.*;
import weather_rest.service.CityService;
 
@RestController
public class CityRestController {
        
        @Autowired
        private CityService cityService;
        
        @GetMapping("/api/cities/{city}")
        public CityInfo getWeather(@PathVariable("city") String cityName) {
           // TODO your code goes here
           return null;
        }
}

